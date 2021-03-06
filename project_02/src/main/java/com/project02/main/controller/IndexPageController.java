package com.project02.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project02.main.service.UserService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class IndexPageController {

    private static final Logger logger = LogManager.getLogger(IndexPageController.class);
    
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		logger.info("work");

		return "index";
	}
	
}
