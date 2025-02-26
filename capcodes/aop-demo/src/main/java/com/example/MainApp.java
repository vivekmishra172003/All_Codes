package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.service.UserService;

public class MainApp {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = 
        new AnnotationConfigApplicationContext(AppConfig.class);
    
    UserService userService = context.getBean(UserService.class);
    userService.createUser("john_doe");
    
    context.close();
  }
}