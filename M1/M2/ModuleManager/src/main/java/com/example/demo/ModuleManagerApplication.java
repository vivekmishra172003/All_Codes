package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.entity")
@ComponentScan(basePackages={"com.repository","com.controller","com.entity","com.service","com.exception"})
@EnableJpaRepositories("com.repository")
@SpringBootApplication
public class ModuleManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleManagerApplication.class, args);
	}

}
