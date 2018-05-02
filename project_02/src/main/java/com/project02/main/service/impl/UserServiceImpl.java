package com.project02.main.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project02.main.dao.UserRepository;
import com.project02.main.entity.User;
import com.project02.main.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	//idkwhyis(d) good :D
	@Override
	public Optional<User> getUserByID(Long id) {
		return userRepository.findById(id);
	}
	
	
}