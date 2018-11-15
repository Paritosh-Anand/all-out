package com.panand.consul;

import com.orbitz.consul.Consul;
import com.orbitz.consul.KeyValueClient;
import com.orbitz.consul.cache.ConsulCache;
import com.orbitz.consul.cache.KVCache;

import java.util.Map;

public class ConsulClient {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("==========starting to test Consul Client=========");
        Consul client = Consul.builder().build();

        final KeyValueClient kvClient = client.keyValueClient();
        kvClient.putValue("foo", "bar");

        System.out.println("Value of foo is = " + kvClient.getValue("foo"));

        KVCache cache = KVCache.newCache(kvClient, "foo");

        cache.addListener(new ConsulCache.Listener<String, com.orbitz.consul.model.kv.Value>() {
            public void notify(Map<String, com.orbitz.consul.model.kv.Value> map) {
                System.out.println("listener key value for foo = " + map.values());
                System.out.println(kvClient.getValueAsString("foo"));
            }
        });
        cache.start();

        Thread.sleep(200000);

        cache.stop();

    }
}
