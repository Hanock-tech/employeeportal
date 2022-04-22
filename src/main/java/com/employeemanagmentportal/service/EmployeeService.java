package com.employeemanagmentportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagmentportal.model.EmployeeData;
import com.employeemanagmentportal.model.EmploymentHistory;
import com.employeemanagmentportal.repository.EmployeeRepository;
import com.employeemanagmentportal.repository.EmploymentHistoryRepository;
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Autowired
	private EmploymentHistoryRepository employeeHisory;

		
	public List<EmployeeData> getEmployeeList() {

		return repository.findAll();
	}

		public EmployeeData saveEmployee(EmployeeData employee) {
			EmployeeData res=repository.save(employee);
			return res;
		}
		public List<EmploymentHistory> getEmploymentHistoryList(long empId) {

			List<EmploymentHistory> EmploymentHistoryDetails =employeeHisory.findAllByEmpId(empId);

			return EmploymentHistoryDetails;
			
		}

		public EmployeeData updateEmployee(long empId) {
			EmployeeData EmployeeDetails=repository.getById(empId);
			System.out.println(EmployeeDetails);
			return EmployeeDetails;
		}
		
		public int deleteEmployee(long empId) {
		try {
repository.deleteById(empId);
			
			return 0;
		}
		catch(Exception ex) {
			ex.getMessage();
		}
			return 1;
		}

		public List<EmployeeData> searchData(String empId, String empName, String gender) {
			
		//	repository.searchData(empId,empName,gender);
			return repository.searchData(empId,empName,gender);
		}
		
}
