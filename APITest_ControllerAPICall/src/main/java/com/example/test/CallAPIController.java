package com.example.test;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallAPIController{
	@PostMapping("/ajax")
	public List<QiitaArticleClass> submitAjax() throws Exception {
		QiitaAPI api = new QiitaAPI();
		return api.callTest();
	}

	
}

