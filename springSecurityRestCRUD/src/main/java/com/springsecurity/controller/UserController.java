package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.model.User;
import com.springsecurity.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/allusers")
	public List<User> getAllUsers() {
		System.out.println("in controller");
		return service.getAllUsers();

	}

	@PostMapping("/adduser")
	public void add(@RequestBody User user) {
		System.out.println("in add user");
		service.addUser(user);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		service.deleteUser(id);
	}

}
