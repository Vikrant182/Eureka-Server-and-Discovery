package com.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.model.EmployeeInfoModel;

@RequestMapping("/employee")
public interface IEmployeeController {

	@GetMapping("/get/all")
	public List<EmployeeInfoModel> getAllEmployeeInfo();

	@GetMapping("/get/id/{id}")
	public EmployeeInfoModel getEmployeeById(@PathVariable("id") int id);

	@GetMapping("/get/name/{name}")
	public EmployeeInfoModel getEmployeeByName(@PathVariable("name") String name);
}
