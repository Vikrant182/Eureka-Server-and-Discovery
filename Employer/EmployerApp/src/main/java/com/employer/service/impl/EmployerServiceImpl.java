package com.employer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employer.model.EmployerInfoModel;
import com.employer.service.IEmployerService;

@Service
public class EmployerServiceImpl implements IEmployerService{
	
	List<EmployerInfoModel> emplList = new ArrayList<>();
	
	public EmployerServiceImpl() {
		EmployerInfoModel model = new EmployerInfoModel();
		model.setEmployerId(101);
		model.setEmployerName("ibm");
		model.setCapacity(50000);
		
		EmployerInfoModel model1 = new EmployerInfoModel();
		model1.setEmployerId(102);
		model1.setEmployerName("cts");
		model1.setCapacity(40000);
		
		EmployerInfoModel model2 = new EmployerInfoModel();
		model2.setEmployerId(103);
		model2.setEmployerName("GS");
		model2.setCapacity(30000);
		
		emplList.add(model);
		emplList.add(model1);
		emplList.add(model2);
	}

	public List<EmployerInfoModel> findAllEmployer() {
		return emplList;
	}

	public EmployerInfoModel findEmployerById(int id) {
		EmployerInfoModel newModel = new EmployerInfoModel();
		emplList.forEach(model -> {
			if(id == model.getEmployerId()) {
				newModel.setEmployerId(id);
				newModel.setEmployerName(model.getEmployerName());
				newModel.setCapacity(model.getCapacity());
			}
		});
		return newModel;
	}

	public EmployerInfoModel findEmployerByName(String name) {
		EmployerInfoModel newModel = new EmployerInfoModel();
		emplList.forEach(model -> {
			if(name.equalsIgnoreCase(model.getEmployerName())) {
				newModel.setEmployerId(model.getEmployerId());
				newModel.setEmployerName(name);
				newModel.setCapacity(model.getCapacity());
			}
		});
		return newModel;
	}

}
