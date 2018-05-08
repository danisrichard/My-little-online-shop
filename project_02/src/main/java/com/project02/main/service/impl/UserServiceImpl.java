package com.project02.main.service.impl;

import java.util.*;

import com.project02.main.dao.RoleRepository;
import com.project02.main.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project02.main.dao.UserRepository;
import com.project02.main.entity.User;
import com.project02.main.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.management.relation.Role;


@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	private final PasswordEncoder passwordEncoder;

	private static final String USER_ROLE = "ROLE_USER";
    //private List<Roles> list;

    @Autowired
	public UserServiceImpl(UserRepository userRepo, RoleRepository roleRepo, PasswordEncoder pwEnc) {
		this.userRepository = userRepo;
		this.roleRepository = roleRepo;
		this.passwordEncoder = pwEnc;
	}

	@Override
	public Optional<User> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User saveUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setActive(1);
		user.setRoles(Collections.singletonList(roleRepository.findByRole(USER_ROLE)));
		return userRepository.saveAndFlush(user);
	}
}