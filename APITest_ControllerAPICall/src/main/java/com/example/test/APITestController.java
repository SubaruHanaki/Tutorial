package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class APITestController{
	
	@GetMapping("/")
	public ModelAndView index(@ModelAttribute("data") String data, ModelAndView mav) {
		
		try {
			List<QiitaArticleClass> result =  new ObjectMapper().readValue(data, new TypeReference<List<QiitaArticleClass>>() {});
			mav.addObject("data", result);
		}catch(Exception e){
			mav.addObject("data", new ArrayList<QiitaArticleClass>(0));
			
		}
		/*
		*/
		mav.setViewName("index");
		return mav;
		
	}
	
	@PostMapping("/")
	public String submit(RedirectAttributes redirectAttributes) throws Exception {
		
		Logger logger = Logger.getLogger("test");
		logger.log(Level.INFO,"CALLTest");
		QiitaAPI api = new QiitaAPI();
		redirectAttributes.addFlashAttribute("data", api.callTest());

		return "redirect:/";
	}
	
	
}

