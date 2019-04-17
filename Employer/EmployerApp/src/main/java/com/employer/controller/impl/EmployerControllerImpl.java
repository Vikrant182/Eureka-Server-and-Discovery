package com.employer.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.employer.controller.IEmployerController;
import com.employer.model.EmployerInfoModel;
import com.employer.service.IEmployerService;

@RestController
public class EmployerControllerImpl implements IEmployerController{
	
	@Autowired
	private IEmployerService service;

	public List<EmployerInfoModel> getAllEmployer() {
		return service.findAllEmployer();
	}

	public EmployerInfoModel getEmployerById(int id) {
		return service.findEmployerById(id);
	}

	public EmployerInfoModel getEmployerByName(String name) {
		return service.findEmployerByName(name);
	}
	
	
}
