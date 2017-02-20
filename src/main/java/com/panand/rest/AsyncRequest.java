package com.panand.rest;

import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Future;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;

public class AsyncRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Future<HttpResponse<JsonNode>> future = Unirest.post("http://httpbin.org/post")
				  .header("accept", "application/json")
				  .field("param1", "value1")
				  .field("param2", "value2")
				  .asJsonAsync(new Callback<JsonNode>() {

				    public void failed(UnirestException e) {
				        System.out.println("The request has failed");
				    }

				    public void completed(HttpResponse<JsonNode> response) {
				         int code = response.getStatus();
				         JsonNode body = response.getBody();
				         InputStream rawBody = response.getRawBody();
				         System.out.println(response.getBody()); 
				    }

				    public void cancelled() {
				        System.out.println("The request has been cancelled");
				    }

				});

	}

}
