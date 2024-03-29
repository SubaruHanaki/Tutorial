package com.reevon.test.domain.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reevon.test.domain.model.QiitaArticleModel;

public class QiitaAPI{
	
	private final static String endpoint = "https://qiita.com/api/v2";
	
	public static String call(String api, Map<String, Object> params) throws Exception {
		
		RestTemplate rest = new RestTemplate();
		
		String paramUrl ="";
		if(params != null) {
	        for (Map.Entry<String, Object> entry : params.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	            if(entry.getValue() != "") {
		            String param = entry.getKey() + "=" + entry.getValue();
		            paramUrl = paramUrl + (paramUrl.length()>0?"&":"?") + param;
	            }
	        }
		}
		String url = endpoint + "/" + api + paramUrl;//"https://qiita.com/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita";
		
		
		
		Logger logger = Logger.getLogger("test");
		logger.log(Level.INFO,url);
		//https://qiita.com/api/v2/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita
		//https://qiita.com/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita

		ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET,null,String.class);
				
		String json = response.getBody();
				
		return json;
		
	}
	
	public static ArrayList<QiitaArticleModel>  callArticle() throws Exception{
		final String api = "items?page=1&per_page=20&query=qiita+user%3AQiita";
		String json = call(api, null);
		return new ObjectMapper().readValue(json, new TypeReference<ArrayList<QiitaArticleModel>>() {});
	}
	
	
	public static ArrayList<QiitaArticleModel>  callArticles(int page, int per_page, String query){
		final String api = "items";//"items?page="+page+"&per_page="+per_page+"&query=qiita+user%3AQiita";
		Map<String,Object> params = new HashMap<String, Object>(){
			{
				put("page",page);
				put("per_page",per_page);
				put("query",query);
			}
		};
		
		String json;
		try {
			json = call(api, params);
			return new ObjectMapper().readValue(json, new TypeReference<ArrayList<QiitaArticleModel>>() {});
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			return new ArrayList<QiitaArticleModel>() {};
		}
	}
	

}
