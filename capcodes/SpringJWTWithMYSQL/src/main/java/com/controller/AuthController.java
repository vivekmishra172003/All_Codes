package com.controller;


import jakarta.validation.Valid;


import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.request.LoginRequest;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/app")
public class AuthController {
	
	@PostMapping("/signin")
	public ResponseEntity<?> validateUser(@Valid @RequestBody LoginRequest loginRequest) {

		return null;
						
												
	}

}
