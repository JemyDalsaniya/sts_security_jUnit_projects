package com.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.dao.UserRepository;
import com.springsecurity.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		System.out.println("inside all user in service");
		return userRepository.findAll();
	}

	@Override
	public void addUser(User user) {
		System.out.println("inside save user");
		userRepository.save(user);

	}

	@Override
	public User getUser(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
