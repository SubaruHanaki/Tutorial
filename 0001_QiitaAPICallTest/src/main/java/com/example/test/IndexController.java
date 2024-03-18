package com.example.test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController{
	
	private QiitaAPI api = new QiitaAPI();
	
	@GetMapping("/")
	public String index(Model model) {
		Logger logger = Logger.getLogger("index");
		logger.log(Level.INFO,"");
		
		//Modelに"form"が存在しない時だけ、下記の処理を実行
		if (!model.containsAttribute("form")) {
			model.addAttribute("form", new QiitaForm());
		}
		//Modelに"list"が存在しない時だけ、下記の処理を実行
		if (!model.containsAttribute("list")) {
			model.addAttribute("list", new ArrayList<QiitaArticleModel>());
		}
		

		return "index";
		
	}
	@PostMapping("/")
	public String submit(@ModelAttribute @Validated QiitaForm form, BindingResult bindingResult, RedirectAttributes redirectAttr){
		try {
			Logger logger = Logger.getLogger("test");
			//logger.log(Level.INFO,"CALLTest:"+form.getQuery());
			
		    redirectAttr.addFlashAttribute("form",form);
		    
			if(bindingResult.hasErrors()) {
			    for (ObjectError error : bindingResult.getAllErrors()) {
					logger.log(Level.INFO,error.getDefaultMessage());
			    }
			    //RedirectAttributeでBindingResult, 対象のModelAttributeをリダイレクト先に渡す
			    redirectAttr.addFlashAttribute("org.springframework.validation.BindingResult.form", bindingResult);
				return "redirect:/";
			}

			redirectAttr.addFlashAttribute("list",api.callArticles(form.getPage(),form.getPer_page(),form.getQuery()));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return "redirect:/";
	}
}
