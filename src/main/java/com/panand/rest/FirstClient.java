package com.panand.rest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class FirstClient {

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post("http://httpbin.org/post")
				  .header("accept", "application/json")
				  .queryString("apiKey", "123")
				  .field("parameter", "value")
				  .field("foo", "bar")
				  .asJson();

		System.out.println(jsonResponse.getBody());
		
		System.out.println(jsonResponse.getHeaders());
		
	}

}
