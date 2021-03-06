
package com.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.dao.UserRepository;
import com.springsecurity.model.CustomUserDetail;
import com.springsecurity.model.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("inside method load by user name");
		User user = this.userRepository.findByUsername(username);
		System.out.println("user in customuser detail service" + user);
		if (user == null) {
			throw new UsernameNotFoundException("No User found!!");
		}
		return new CustomUserDetail(user);
	}

}
