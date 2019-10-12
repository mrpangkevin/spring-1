package com.atguigu.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.spring.beans.annotation.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	@Qualifier("userJdbcRepository")
	private UserRepository userRepository;
//	@Autowired
//	public void setUserRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	public void add() {
		System.out.println("UserService add...");
		userRepository.save();
	}
}
