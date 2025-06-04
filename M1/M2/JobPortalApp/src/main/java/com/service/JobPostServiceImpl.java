package com.service;

import java.util.List;
import com.entities.JobPost;
import com.exception.InvalidEmployerException;
import com.exception.InvalidJobPostException;
import com.repository.EmployerRepository;
import com.repository.JobPostRepository;
import org.springframework.stereotype.Service;

@Service
public class JobPostServiceImpl implements IJobPostService {

	// Provide necessary Annotation
	private JobPostRepository jobRepository;

	// Provide necessary Annotation
	private EmployerRepository empRepository;

	public JobPost addJobPost(JobPost jobPostObj, String employerId) throws InvalidEmployerException
	{
		return null;
	}
	
	public JobPost updateOfferedSalary(String jobId, double salaryOffered) throws InvalidJobPostException
	{
		return null;
	}	
	
	public List<JobPost> viewJobsBySalaryOffered(double salaryOffered)
	{
		return null;
	}
	
	public List<JobPost> viewJobsByCompanyAndLocation(String companyName, String location){
		return null;
	}
	
	public JobPost markJobPostAsClosed(String jobId) throws InvalidJobPostException {
		return null;
	
	}
}
