package com.example.test;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallAPIController{
	@PostMapping("/ajax")
	public String submitAjax() throws Exception {
		return callQiitaAPI();
	}
	
	private String callQiitaAPI() throws Exception {
		
		RestTemplate rest = new RestTemplate();
		
		final String url = "https://qiita.com/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita";//"https://qiita.com/api/v2/";

		ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET,null,String.class);
				
		String json = response.getBody();
				
		return json;
		
	}
	
	
	
}

