package com.springsecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springsecurity.model.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = new ArrayList<>();

	public UserServiceImpl() {
		// list.add(new User(0, "jemy", "123", "jemy@gmail.com", "", null, null, null));
		// list.add(new User("nikita", "123", "nikita@gmail.com"));
		list.add(new User(1, "manali", "manu@gmail.com", "123", "2001-08-03", "Normal", "142628", "female"));
	}

	@Override
	public List<User> getAllUsers() {
		return this.list;
	}

	@Override
	public User getUser(String username) {
		System.out.println("inside get user in service");
		return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	@Override
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}

}
