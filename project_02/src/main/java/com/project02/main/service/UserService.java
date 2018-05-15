package com.project02.main.service;

import java.util.Optional;
import com.project02.main.entity.User;

public interface UserService {

	Optional<User> findByUsername(String username);

	Optional<User> findByEmail(String email);

	User saveUser(User user);
}
