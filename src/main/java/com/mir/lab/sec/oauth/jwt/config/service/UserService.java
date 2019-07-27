package com.mir.lab.sec.oauth.jwt.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mir.lab.sec.oauth.jwt.config.model.User;
import com.mir.lab.sec.oauth.jwt.config.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
		
	}
}
