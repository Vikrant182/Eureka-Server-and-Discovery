package com.employee.model;

import com.employer.model.EmployerInfoModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeInfoModel {
	private int id;
	private String name;
	private long salary;
	private String employerName;
	private EmployerInfoModel empModel;
}
