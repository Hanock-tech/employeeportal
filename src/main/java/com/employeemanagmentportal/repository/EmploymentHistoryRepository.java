package com.employeemanagmentportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeemanagmentportal.model.EmploymentHistory;

@Repository
public interface EmploymentHistoryRepository extends JpaRepository<EmploymentHistory, Long>{
    @Query("SELECT history from employment_history history   where history.emp_id=?1 ")
	List<EmploymentHistory> findAllByEmpId(long empId);
	
}
