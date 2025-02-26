package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    
    public static Department loadStaffDetails() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Department department = (Department) context.getBean("departmentObj");
        return department;
    }

    public static void main(String[] args) {
        Department department = loadStaffDetails();
        department.displayStaffDetails();
    }
}