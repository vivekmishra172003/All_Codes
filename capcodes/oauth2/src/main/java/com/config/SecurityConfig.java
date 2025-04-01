package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @Configuration
// @Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Value("${security.username}")
	 private String username;
	 
	 @Value("${security.pwd}")
	 private String pwd;
	 
	 @Value("${security.role}")
	 private String role;
	 
	 
	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	
        
    }
     
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){ 
//        return new BCryptPasswordEncoder(); 
//    }
}
