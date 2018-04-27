package com.project02.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

	@GetMapping("/index")
	public String loadIndexPage() {
		
		return "index";
	}
	
	@GetMapping("/")
	public String loadLoginPage() {
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logooutPage() {
		
		return "redirect:/login";
	}
	
}
