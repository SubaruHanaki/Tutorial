package com.example.test;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController{
	
	private QiitaAPI api = new QiitaAPI();
	
	@GetMapping("/")
	public ModelAndView index(@ModelAttribute("form") @Validated QiitaForm form, @ModelAttribute("list")ArrayList<QiitaArticleModel> list,  ModelAndView mav) {
		/*
		try {
			Logger logger = Logger.getLogger("test22");
			logger.log(Level.INFO,String.valueOf(form.getPage()));
			mav.addObject("form", form);
			mav.addObject("list", list);
			mav.setViewName("index");
			return mav;
			
		}catch(Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		*/
		
		Logger logger = Logger.getLogger("test22");
		logger.log(Level.INFO,String.valueOf(form.getPage()));
		mav.addObject("form", form);
		mav.addObject("list", list);
		mav.setViewName("index");
		return mav;
	}
	@PostMapping("/")
	public ModelAndView submit(@ModelAttribute @Validated QiitaForm form, BindingResult bindingResult, RedirectAttributes redirectAttr){
		try {
			Logger logger = Logger.getLogger("test");
			logger.log(Level.INFO,"CALLTest:"+form.getQuery());
			
			if(bindingResult.hasErrors()) {
			    for (ObjectError error : bindingResult.getAllErrors()) {
					logger.log(Level.INFO,error.getDefaultMessage());
			    }
				redirectAttr.addFlashAttribute("form",form);
				return new ModelAndView("redirect:/");
			}
			redirectAttr.addFlashAttribute("form",form);
			redirectAttr.addFlashAttribute("list",api.callArticles(form.getPage(),form.getPer_page(),form.getQuery()));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/");
	}
	/*
	@PostMapping("/")
	public String submit(@ModelAttribute @Validated QiitaForm form, BindingResult bindingResult, RedirectAttributes redirectAttr){
		try {
			Logger logger = Logger.getLogger("test");
			logger.log(Level.INFO,"CALLTest:"+form.getQuery());
			
			if(bindingResult.hasErrors()) {
			    for (ObjectError error : bindingResult.getAllErrors()) {
					logger.log(Level.INFO,error.getDefaultMessage());
			    }				
				redirectAttr.addFlashAttribute("form",form);
				return "redirect:/";
			}
			redirectAttr.addFlashAttribute("form",form);
			redirectAttr.addFlashAttribute("list",api.callArticles(form.getPage(),form.getPer_page(),form.getQuery()));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return "redirect:/";
	}
	*/
	
	
}
