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
	
	@GetMapping("/form")
	public String index(Model model) {
		
		if(!model.containsAttribute("form")) {
			model.addAttribute("form", new InputForm());
		}

		if(!model.containsAttribute("list")) {
			model.addAttribute("list", new ArrayList<InputForm>());
		}
		return "form";
	}
	
	@PostMapping("/form")
	public String add(@ModelAttribute("form") InputForm form, @ModelAttribute("list") ArrayList<InputForm> list, RedirectAttributes redirectAttr) {
		redirectAttr.addFlashAttribute("form", form);
		
		list.add(form);
		redirectAttr.addFlashAttribute("list", list);
		return String.join("redirect:/", "form");
	}
	

}
