package com.springsecurity.service;

import java.util.List;

import com.springsecurity.model.User;

public interface UserService {

	List<User> getAllUsers();

	void addUser(User user);

	void deleteUser(int id);

}
