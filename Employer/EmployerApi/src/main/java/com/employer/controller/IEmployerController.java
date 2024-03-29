package com.employer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employer.model.EmployerInfoModel;

@RequestMapping("/employer")
public interface IEmployerController {
	
	@GetMapping("/get/all")
	public List<EmployerInfoModel> getAllEmployer();
	
	@GetMapping("/get/id/{id}")
	public EmployerInfoModel getEmployerById(@PathVariable ("id") int id);

	@GetMapping("/get/name/{employerName}")
	public EmployerInfoModel getEmployerByName(@PathVariable ("employerName") String name);
	
}
