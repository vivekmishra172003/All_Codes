package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

  @Before("execution(* com.example.service.UserService.createUser(..))")
  public void logBeforeUserCreation() {
    System.out.println("[AOP] Starting user creation...");
  }

  @After("execution(* com.example.service.UserService.createUser(..))")
  public void logAfterUserCreation() {
    System.out.println("[AOP] User creation completed.");
  }
}