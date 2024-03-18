package com.example.sample;

import lombok.Data;

@Data
public class RESTfulAPIResponse {

	public RESTfulAPIResponse(int id, String name, int age) {
		this.id = id;
		this.name= name;
		this.age = age;
	}
	private int id;
	
	private int age;
	
	private String name;
	
}
