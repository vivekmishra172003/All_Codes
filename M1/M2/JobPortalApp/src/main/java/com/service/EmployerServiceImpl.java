package com.service;

import java.util.List;
import java.util.Map;

import com.entities.Employer;
import com.exception.InvalidEmployerException;
import com.repository.EmployerRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImpl implements IEmployerService {
		// Provide necessary Annotation
		private EmployerRepository empRepository;

		public Employer addEmployer(Employer employerObj) {
			return null;
		}
		
		public Employer updateLocation(String employerId, String location) throws InvalidEmployerException
		{
			return null;
		}
		
		public Employer viewEmployerById(String employerId) throws InvalidEmployerException
		{
			return null;
		}
		
		public List<Employer> viewEmployersByIndustry(String industry)
		{
			return null;
		}
		
		public List<Employer> viewEmployersByJobTitle(String title){
			return null;
		}
		
		public Map<String,Integer> getEmployerWiseJobCount(){
			return null;
		}
		
}
