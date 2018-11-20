package com.adineh.hw.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.adineh.hw.model.User;

public interface UserService extends UserDetailsService {
	User findByUsername(String username);

}
