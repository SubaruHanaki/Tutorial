package com.example.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class APITestController{
	
	@GetMapping("/")
	public ModelAndView index(@ModelAttribute("data") String data, ModelAndView mav) {
		mav.addObject("data", data);
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/")
	public String submit(RedirectAttributes redirectAttributes) throws Exception {
		
		Logger logger = Logger.getLogger("test");
		logger.log(Level.INFO,"CALLTest");
		String result = callQiitaAPI();
		logger.log(Level.INFO,result);
		redirectAttributes.addFlashAttribute("data", result);

		return "redirect:/";
	}
		
	private String callQiitaAPI() throws Exception {
		
		RestTemplate rest = new RestTemplate();

		final String url = "https://qiita.com/api/v2/items?page=1&per_page=20&query=qiita+user%3AQiita";//"https://qiita.com/api/v2/";

		ResponseEntity<String> response = rest.exchange(url, HttpMethod.GET,null,String.class);
				
		String json = response.getBody();
				
		return json;
		
	}
	
	
	
}

