package com.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

//	@Autowired
//	UserRepository userRepository;
//
//	@Autowired
//	BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		User user = new User();
//		user.setUsername("riddhi");
//		user.setContact("256278282");
//		user.setDob("2001-08-03");
//		user.setEmail("r@gmail.com");
//		user.setRole("ROLE_NORMAL");
//		user.setPassword(passwordEncoder.encode("123"));
//		userRepository.save(user);
//
//	}

}
