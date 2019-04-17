package com.employer.service;

import java.util.List;

import com.employer.model.EmployerInfoModel;

public interface IEmployerService {
	
	public List<EmployerInfoModel> findAllEmployer();
	
	public EmployerInfoModel findEmployerById(int id);
	
	public EmployerInfoModel findEmployerByName(String name);
}
