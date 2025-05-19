package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.dao.Employee;
import com.example.employee.service.EmployeeService;

@RestController
//So, when you use @RestController, you're saying:
//"This class will handle HTTP requests and return data directly,
//"typically in JSON or XML format."

@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired // automatic object creation
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

//	1.Post Mapping  : to post a request. -> to add a new Employee.

	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
	}

	@GetMapping
	List<Employee> getEmpDetails() {
		return employeeService.getAllEmployees();
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployeeByID(id);
	}
	
}
