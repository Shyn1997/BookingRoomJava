package com.example.securityConfig;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class SecurityConfig {
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests().antMatchers("/login").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/login").permitAll();
	}
}
