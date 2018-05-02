package com.project02.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.UserRepository;
import com.project02.main.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository users;
	
	public Optional<User> findByID(Long id) {
		
		return users.findById(id);
	}
	
}
