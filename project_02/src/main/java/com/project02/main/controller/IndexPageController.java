package com.project02.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class IndexPageController {

    private static final Logger logger = LogManager.getLogger(IndexPageController.class);
	
	@GetMapping("/index")
	public String loadIndexPage() {

		
		return "index";
	}
	
	@GetMapping("/")
	public String loadLoginPage() {
		
		logger.debug("dsadsadsa");
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logooutPage() {
		
		return "redirect:/login";
	}
	
}
