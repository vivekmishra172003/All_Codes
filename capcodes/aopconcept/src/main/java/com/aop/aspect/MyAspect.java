package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    
    // Pointcut expression that targets the makePayment method in PaymentService implementation
    @Pointcut("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
    public void makePaymentPointcut() {}
    
    // This advice will run before the makePayment method
    @Before("makePaymentPointcut()")
    public void printBefore() {
        System.out.println("Payment processing started...");
        System.out.println("Payment authentication completed!");
    }
    
    // This advice will run after the makePayment method
    @After("makePaymentPointcut()")
    public void printAfter() {
        System.out.println("Payment processing completed!");
        System.out.println("Payment receipt generated.");
    }
}