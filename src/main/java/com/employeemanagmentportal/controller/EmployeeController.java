package com.employeemanagmentportal.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.employeemanagmentportal.model.EmployeeData;
import com.employeemanagmentportal.model.EmploymentHistory;
import com.employeemanagmentportal.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	String	msgs="";

public boolean msg1;
	@GetMapping("/employees")
	public String getEmployeeList(Model model) {
try {
		List<EmployeeData> employeeList = service.getEmployeeList();
	
		model.addAttribute("employeeList", employeeList);
			
			if(msg1) {
				String global=getmsg(msgs);
				model.addAttribute("sucess", global);	
						
			}
			else {
			
				String global=getmsg(msgs);
		
				model.addAttribute("error", global);	
				
			}
}
catch(Exception e){
  e.getMessage();
}
	

		
		msgs="";
		
		return "index";

	}
	
	@GetMapping("/searchEmployee")
	public String searchEmployee(@RequestParam("empId") String empId,@RequestParam("empName") String empName,@RequestParam(required=false) String gender ,Model model,RedirectAttributes res) {

		List<EmployeeData> employeeList = service.searchData(empId,empName,gender);
		System.out.println(employeeList);
		if(employeeList.isEmpty() ||  employeeList ==null) {
			
			model.addAttribute("error", "Sorry, employee record could not be found!!");
			
			return "error_display";
		}
		
		model.addAttribute("employeeList", employeeList);

		return "index";

	}

	@GetMapping("/employee/new")
	public String GetEmployee( Model model,EmployeeData employee) {
	
		model.addAttribute("employee", employee);

		return "create_employee";

	}
	@PostMapping("/employee/new")
	public String createEmployee( @Valid  @ModelAttribute("employee")EmployeeData employee ,BindingResult bindingResult, Model model) {
		try {
		if(bindingResult.hasErrors()) {
			
			
			model.addAttribute("error" ,"Form has invalid input data,please correct the errors and submit again!! ");
			
			return "create_employee";
		}
		EmployeeData data=service.saveEmployee(employee);
		System.out.println("result"+data);
if(data!=null) {
	msg1 =true;
	msgs= "Employee record has been saved successfully";
	
	return "redirect:/api/employees";
	
}

		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		 

			msg1 =false;
			msgs= "Failed To Insert Record Please try Again ";
			
			return "redirect:/api/employees";
		

	}
	

	@GetMapping("/employeehistory/{empId}")
	public String employeeHistory(@PathVariable("empId") long empId,Model model) {

		List<EmploymentHistory> employeeList = service.getEmploymentHistoryList(empId);	
		
		model.addAttribute("employeeHistoryList", employeeList);
			
		return "history_employee";

	}
	@GetMapping("/updateEmployee/{empId}")
	public String GetEmployee(@PathVariable("empId") int empId ,Model model) {

		 EmployeeData result=service.updateEmployee(empId);
		 
		 model.addAttribute("employee", result);
		 
		return "create_employee";
	}

	@GetMapping("/deleteEmployee/{empId}")
	@ResponseBody
	public String deleteEmployee(@PathVariable("empId") int empId,Model model,RedirectAttributes res ) {
	System.out.println(empId);
	
		 int result=service.deleteEmployee(empId);	
		 System.out.println(result);
	if(result==0) {
		model.addAttribute("sucess", "Employee record has been deleted successfully");
		msgs="Employee record has been deleted successfully";
	msg1=true;
		return "redirect:/api/employees";
	}
	else {
		msg1=false;
		msgs= "Employee record has been Not  deleted  successfully";
		model.addAttribute("error", "Employee record has been Not  deleted  successfully");
		
		return "error_display";
	}
		

	}
	private String getmsg(String value) {
		
		return value;
	}
	
	
	//@GetMapping("/newemployee")
//	public List<EmployeeData> getEmployee() {
//		EmployeeData employee = new EmployeeData();
//
//		model.addAttribute("employee", employee);
//		List<EmployeeData> employeeList1 = repository.findAll();
//
//		return employeeList1;
//
//	}

}
