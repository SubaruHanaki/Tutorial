package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootingController {
	
	@GetMapping("/rooting") // GETでルーティング
	public String index() {
		return "02_rooting";
	}
}
