package com.reevon.test.controller.rest;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reevon.test.domain.common.QiitaAPI;
import com.reevon.test.domain.model.InputQiitaForm;
import com.reevon.test.domain.model.QiitaArticleModel;

@RestController
public class QiitaRestController {

	@PostMapping("/ajax")
	public ArrayList<QiitaArticleModel> submitAjax() throws Exception {
		return QiitaAPI.callArticle();
	}
	
	@ResponseBody
	@PostMapping("/ajaxparams")
	public ArrayList<QiitaArticleModel> submitAjaxParams(@RequestBody InputQiitaForm form) throws Exception {//@RequestBody QiitaForm form

		Logger logger = Logger.getLogger("test1");
		logger.log(Level.INFO,form.getQuery());

		return QiitaAPI.callArticles(form.getPage(), form.getPer_page(), form.getQuery());
	}


}
