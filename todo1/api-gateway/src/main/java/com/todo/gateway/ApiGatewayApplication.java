package com.todo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient; // Uncomment if you plan to use a discovery service like Eureka or Consul.

@SpringBootApplication
// @EnableDiscoveryClient // For now, we are using direct URLs in application.properties.
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}

