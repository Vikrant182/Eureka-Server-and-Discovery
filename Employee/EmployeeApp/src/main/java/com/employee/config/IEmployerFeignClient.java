package com.employee.config;

import org.springframework.cloud.openfeign.FeignClient;

import com.employer.controller.IEmployerController;

@FeignClient(name="EMPLOYERSERVICE")
public interface IEmployerFeignClient extends IEmployerController{

}
