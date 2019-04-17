package com.employee.service;

import java.util.List;

import com.employee.model.EmployeeInfoModel;

public interface IEmployeeService {
	
	public List<EmployeeInfoModel> findAllEmployee();
	
	public EmployeeInfoModel findEmployeeById(int id);
	
	public EmployeeInfoModel findEmployeeByName(String name);
	
}
