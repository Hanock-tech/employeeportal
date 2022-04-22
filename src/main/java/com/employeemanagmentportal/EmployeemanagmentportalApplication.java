package com.employeemanagmentportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.employeemanagmentportal.*") 
@EntityScan(basePackages={"com.employeemanagmentportal.*"})
@ComponentScan(basePackages={"com.employeemanagmentportal.*"})
public class EmployeemanagmentportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagmentportalApplication.class, args);
	}

}
