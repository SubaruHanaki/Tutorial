package com.example.sample;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FormController {
	
	private final String pageName = "form";
	private final String formName = "form";
	private final String listName = "list";
	
	@GetMapping("/form")
	public String index(Model model) {
		
		if(!model.containsAttribute(formName)) {
			model.addAttribute(formName, new InputForm());
		}

		if(!model.containsAttribute(listName)) {
			model.addAttribute(listName, new ArrayList<InputForm>());
		}
		return pageName;
	}
	
	@PostMapping("/form")
	public String add(@ModelAttribute(formName) InputForm form, @ModelAttribute(listName) ArrayList<InputForm> list, RedirectAttributes redirectAttr) {
		redirectAttr.addFlashAttribute(formName, form);
		
		list.add(form);
		redirectAttr.addFlashAttribute(listName, list);
		return String.join("redirect:/", pageName);
	}
	

}
