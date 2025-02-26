package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {
  public void createUser(String username) {
    System.out.println("User created: " + username);
  }
}