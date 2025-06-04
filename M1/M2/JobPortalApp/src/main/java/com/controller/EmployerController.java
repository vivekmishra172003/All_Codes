package com.controller;

import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;

import com.entities.Employer;
import com.exception.InvalidEmployerException;
import com.service.IEmployerService;

//Provide necessary Annotation
public class EmployerController {

	// Provide necessary Annotation
	private IEmployerService employerService;

	public ResponseEntity<Employer> addEmployer(Employer employerObj) {
		return null;
	}
	
	public ResponseEntity<Employer> updateLocation(String employerId, String location) throws InvalidEmployerException {
		return null;
	}
	
	public ResponseEntity<Employer> viewEmployerById(String employerId) throws InvalidEmployerException {
		return null;
	}
	
	public ResponseEntity<List<Employer>> viewEmployersByIndustry(String industry) {
		return null;
	}
	
	public ResponseEntity<List<Employer>> viewEmployersByJobTitle(String title)  {
		return null;
	}
	
	public ResponseEntity<Map<String,Integer>> getEmployerWiseJobCount() {
		return null;
	}

	
}
