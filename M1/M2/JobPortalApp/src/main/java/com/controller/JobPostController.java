package com.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.entities.JobPost;
import com.exception.InvalidEmployerException;
import com.exception.InvalidJobPostException;
import com.service.IJobPostService;

//Provide necessary Annotation
public class JobPostController {

	// Provide necessary Annotation
	private IJobPostService jobPostService;
		
	public ResponseEntity<JobPost> addJobPost(JobPost jobPostObj, String employerId) throws InvalidEmployerException {
		return null;
	}
	
	public ResponseEntity<JobPost> updateOfferedSalary(String jobId, double salaryOffered) throws InvalidJobPostException{
		return null;
	}

	public ResponseEntity<List<JobPost>> viewJobsBySalaryOffered(double salaryOffered) {
		return null;
	}
	
	public ResponseEntity<List<JobPost>> viewJobsByCompanyAndLocation(String companyName, String location) {
		return null;
	}
	
	public ResponseEntity<JobPost> markJobPostAsClosed(String jobId) throws InvalidJobPostException {
		return null;
	}
	
}
