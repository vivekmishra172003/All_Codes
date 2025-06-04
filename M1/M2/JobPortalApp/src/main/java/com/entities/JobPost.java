package com.entities;

import java.time.LocalDate;

//Provide necessary Annotation
public class JobPost {
	
	// Provide necessary Annotation
	private String jobId; 
	
	private String title; 
	private String description; 
	private double salaryOffered;  
	private int requiredExperience; 
	private LocalDate postingDate;
	private String status;
		
	private Employer employerObj; 

	public JobPost() {
		
	}
}

