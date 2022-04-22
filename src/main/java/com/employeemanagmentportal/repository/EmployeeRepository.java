package com.employeemanagmentportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employeemanagmentportal.model.EmployeeData;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeData, Long>
{
	@Query("SELECT history from employees history  where (?1 is null OR history.emp_id=?1) OR (history.first_name LIKE ?2 OR last_name LIKE ?2)  AND history.gender=?3")
	List<EmployeeData> searchData(@Param("empId")String empId, String empName, String gender);
}
