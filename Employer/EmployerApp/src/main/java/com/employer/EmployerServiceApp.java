package com.employer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployerServiceApp {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployerServiceApp.class, args);
	}
}
