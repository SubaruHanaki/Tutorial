package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QiitaAPI{
	
	public final String endpoint = "https://qiita.com/api/v2";
	
	public String call(String api, HashMap<String, String> params) throws Exception {
		
		RestTemplate rest = new RestTemplate();
		
		final String url = endpoint + "/" + api;//"https://qiita.com/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita";
		Logger logger = Logger.getLogger("test");
		logger.log(Level.INFO,url);
		//https://qiita.com/api/v2/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita
		//https://qiita.com/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita

		ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET,null,String.class);
				
		String json = response.getBody();
				
		return json;
		
	}
	
	public ArrayList<QiitaArticleModel>  callArticle() throws Exception{
		final String api = "items?page=1&per_page=20&query=qiita+user%3AQiita";
		String json = call(api, null);
		return new ObjectMapper().readValue(json, new TypeReference<ArrayList<QiitaArticleModel>>() {});
	}
	
	
	public ArrayList<QiitaArticleModel>  callArticles(int page, int per_page, String query) throws Exception{
		final String api = "items?page=1&per_page=20&query=qiita+user%3AQiita";
		String json = call(api, null);
		return new ObjectMapper().readValue(json, new TypeReference<ArrayList<QiitaArticleModel>>() {});
	}
	

}
