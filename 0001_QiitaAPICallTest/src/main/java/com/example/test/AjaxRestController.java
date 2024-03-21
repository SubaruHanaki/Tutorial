package com.example.test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AjaxRestController {
	
	private QiitaAPI api = new QiitaAPI();

	@PostMapping("/ajax")
	public ArrayList<QiitaArticleModel> submitAjax() throws Exception {
		return api.callArticle();
	}
	
	@ResponseBody
	@PostMapping("/ajaxparams")
	public ArrayList<QiitaArticleModel> submitAjaxParams(@RequestBody QiitaForm form) throws Exception {//@RequestBody QiitaForm form

		Logger logger = Logger.getLogger("test1");
		logger.log(Level.INFO,form.getQuery());

		return api.callArticles(form.getPage(), form.getPer_page(), form.getQuery());
	}


}
