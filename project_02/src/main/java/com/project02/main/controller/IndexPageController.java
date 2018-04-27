package com.project02.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project02.main.dao.UserRepository;
import com.project02.main.entity.User;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class IndexPageController {

    private static final Logger logger = LogManager.getLogger(IndexPageController.class);
	
    //UserRepository userRepository;
    
	@GetMapping("/")
	public String loadIndexPage() {
		
		Long id = (long) 2;
		
		//Optional<User> userName = userRepository.findById(id);
		
		logger.info("it's work");
		
		return "index";
	}
	
}
