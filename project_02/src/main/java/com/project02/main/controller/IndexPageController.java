package com.project02.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project02.main.entity.User;
import com.project02.main.service.UserService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class IndexPageController {

    private static final Logger logger = LogManager.getLogger(IndexPageController.class);
	
    @Autowired
    UserService userService;
    
	@GetMapping("/")
	public String loadIndexPage() {
		
		Long id = (long) 1;
		
		Optional<User> listObject = userService.findByID(id);
		
		logger.info(listObject.get().toString());
		
		logger.info("it's work");
		
		return "index";
	}
	
}
