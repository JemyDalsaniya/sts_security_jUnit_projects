package com.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}
