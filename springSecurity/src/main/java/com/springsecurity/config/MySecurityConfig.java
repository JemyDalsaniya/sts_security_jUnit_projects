package com.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springsecurity.service.CustomUserDetailService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailService customUserDetailService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("inside configure method");

		http.

				csrf().disable().authorizeRequests().antMatchers("/signin").permitAll().antMatchers("/users/**")
				.hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin().loginPage("/signin")
				.loginProcessingUrl("/dologin").defaultSuccessUrl("/users/allusers");

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("inside authentication builder");
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("jemy").password(this.passwordEncoder().encode("123")).roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("admin").password(this.passwordEncoder().encode("123")).roles("ADMIN");
//	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		System.out.println("inside password encoder");
		return new BCryptPasswordEncoder();

	}

}
