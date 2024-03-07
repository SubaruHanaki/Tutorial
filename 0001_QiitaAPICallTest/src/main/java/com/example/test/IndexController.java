package com.example.test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController{
	
	private QiitaAPI api = new QiitaAPI();
	
	@GetMapping("/")
	public ModelAndView index(@ModelAttribute("form") QiitaForm form, @ModelAttribute("list")ArrayList<QiitaArticleModel> list,  ModelAndView mav) {
		Logger logger = Logger.getLogger("test22");
		logger.log(Level.INFO,String.valueOf(form.getPage()));
		
		mav.addObject("form", form);
		mav.addObject("list", list);
		mav.setViewName("index");
		return mav;
		
	}
	
	@PostMapping("/")
	public String submit(@ModelAttribute QiitaForm form, RedirectAttributes redirectAttr) throws Exception {
		Logger logger = Logger.getLogger("test");
		logger.log(Level.INFO,"CALLTest:"+form.getQuery());
		redirectAttr.addFlashAttribute("form",form);
		redirectAttr.addFlashAttribute("list",api.callArticles(form.getPage(),form.getPer_page(),form.getQuery()));
		return "redirect:/";
	}
	
	
}
