package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.test.database.RoleService;
import com.example.test.database.UserService;


@Controller
public class DatabaseTestController {

	@Autowired
    UserService userService;
	
	@Autowired
	RoleService roleService;

    
	@GetMapping("/database")
	public String index(Model model) {

		model.addAttribute("users", userService.SearchAll());
		model.addAttribute("roles", roleService.SearchAll());
		/*
		*/

		return "testdb";
	}
	
	@PostMapping("/database")
	public String submit(@ModelAttribute @Validated QiitaForm form, BindingResult bindingResult, RedirectAttributes redirectAttr) {
		
		
		return "redirect:/database";//"testdb";
	}

}
