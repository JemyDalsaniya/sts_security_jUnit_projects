package com.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/allusers")
	public List<User> getAllUsers() {
		System.out.println("in controller");
		return service.getAllUsers();

	}

	// @PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String name) {
		System.out.println("inside get user");
		return this.service.getUser(name);
	}

	@PostMapping("/adduser")
	public void add(@RequestBody User user) {
		System.out.println("in add user");
		service.addUser(user);
	}

}
