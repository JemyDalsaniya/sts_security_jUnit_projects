package com.springsecurity.service;

import java.util.List;

import com.springsecurity.model.User;

public interface UserService {

	List<User> getAllUsers();

	User getUser(String uname);

	void addUser(User user);

}
