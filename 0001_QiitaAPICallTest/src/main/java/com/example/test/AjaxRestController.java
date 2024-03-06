package com.example.test;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxRestController {
	
	private QiitaAPI api = new QiitaAPI();

	@PostMapping("/ajax")
	public ArrayList<QiitaArticleModel> submitAjax() throws Exception {
		return api.callArticle();
	}


}
