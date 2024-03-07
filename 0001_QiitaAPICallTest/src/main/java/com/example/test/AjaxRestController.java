package com.example.test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxRestController {
	
	private QiitaAPI api = new QiitaAPI();

	@PostMapping("/ajax")
	public ArrayList<QiitaArticleModel> submitAjax() throws Exception {
		return api.callArticle();
	}
	
	@PostMapping("/ajaxpppp")
	public ArrayList<QiitaArticleModel> submitAjaxParams(@RequestBody QiitaForm form) throws Exception {
		Logger logger = Logger.getLogger("test1");
		logger.log(Level.INFO,form.getQuery());

		return api.callArticles(form.getPage(), form.getPer_page(), form.getQuery());
	}


}
