package com.example.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class QiitaArticleModel {

	private String body;
	
	private Boolean coediting;
	
	private Integer comments_count;
	
	private String created_at;
	
	private String id;

	private Integer likes_count;

	private String organization_url_name;

	private Integer page_views_count;

	private Integer reactions_count;

	private String rendered_body;

	private Boolean slide;

	private Integer stocks_count;



	private String title;

	private String updated_at;

	private String url;

}