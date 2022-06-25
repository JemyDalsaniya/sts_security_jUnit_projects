package com.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springsecurity.dao.UserRepository;
import com.springsecurity.model.User;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setUsername("jemy");
		user1.setEmail("jemy@gmail.com");
		user1.setContact("2627282921");
		user1.setDob("2001-08-03");
		user1.setGender("female");
		user1.setPassword(this.passEncoder.encode("123"));
		user1.setRole("ROLE_NORMAL");

		this.userRepository.save(user1);

		User user2 = new User();
		user2.setUsername("admin");
		user2.setEmail("admin@gmail.com");
		user2.setContact("2627282921");
		user2.setDob("2001-08-03");
		user2.setGender("male");
		user2.setPassword(this.passEncoder.encode("123"));
		user2.setRole("ROLE_ADMIN");

		this.userRepository.save(user2);
	}

}
