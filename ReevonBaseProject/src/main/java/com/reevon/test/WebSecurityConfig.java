package com.reevon.test;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests(authorize -> authorize
				//.requestMatchers("/").permitAll()
				.requestMatchers("/").hasAuthority("ADMIN")
				.requestMatchers("/login").permitAll()
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.requestMatchers("/resources/templates/layout/**").permitAll()
				.requestMatchers("/layout/**").permitAll()
				//.requestMatchers("/ajaxparams","/ajax").permitAll()
				//.requestMatchers("/roleAdmin").hasAuthority("ADMIN")
				.anyRequest().authenticated()
				)
		.formLogin(form -> form
				.loginPage("/login")
				)
		;
		return http.build();
	}
	/*
	*/
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}