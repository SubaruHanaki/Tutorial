package com.example.test;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class QiitaArticleListModel implements Cloneable {
	
	private ArrayList<QiitaArticleModel> ArticleList;
	

}
