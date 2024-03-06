package com.example.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown=true)
public class QiitaArticleClass {

	@Getter @Setter
	private String body;
	
	@Getter @Setter
	private Boolean coediting;
	
	@Getter @Setter
	private Integer comments_count;
	
	@Getter @Setter
	private String created_at;
	
	

	@Getter @Setter
	private String id;
	@Getter @Setter
	private Integer likes_count;
	@Getter @Setter
	private String organization_url_name;
	@Getter @Setter
	private Integer page_views_count;
	@Getter @Setter
	private Integer reactions_count;
	@Getter @Setter
	private String rendered_body;
	@Getter @Setter
	private Boolean slide;
	@Getter @Setter
	private Integer stocks_count;


	@Getter @Setter
	private String title;
	@Getter @Setter
	private String updated_at;
	@Getter @Setter
	private String url;

	@Getter @Setter
	private String group;

}