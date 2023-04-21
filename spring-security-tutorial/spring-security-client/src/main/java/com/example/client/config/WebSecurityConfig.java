package com.example.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurityConfig {
	
	private static final String[] WHITE_LIST_URLS= {
			"/register",
			"/resendVarifyToken*",
			"/verifyRegistration"
	};
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(11);
	}
	
	
	//whitelisting our urls...cors and csrf is used to permit post request
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
		http
			.cors()
			.and()
			.csrf()
			.disable()
			.authorizeHttpRequests()
			.antMatchers(WHITE_LIST_URLS)
			.permitAll();
		
		return http.build();
	}

}
