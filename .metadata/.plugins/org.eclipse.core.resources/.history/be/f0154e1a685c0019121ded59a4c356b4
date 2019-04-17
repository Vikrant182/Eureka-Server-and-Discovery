package com.employee.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.employee.controller.IEmployeeController;
import com.employee.model.EmployeeInfoModel;
import com.employee.service.IEmployeeService;

@RestController
public class EmployeeControllerImpl implements IEmployeeController{
	
	@Autowired
	private IEmployeeService service;

	public List<EmployeeInfoModel> getAllEmployeeInfo() {
		return service.findAllEmployee();
	}

	public EmployeeInfoModel getEmployeeById(int id) {
		return service.findEmployeeById(id);
	}

	public EmployeeInfoModel getEmployeeByName(String name) {
		return service.findEmployeeByName(name);
	}

}
