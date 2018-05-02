package com.project02.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project02.main.dao.UserRepository;
import com.project02.main.entity.User;

public interface UserService {
	
	Optional<User> getUserByID(Long id);
}
