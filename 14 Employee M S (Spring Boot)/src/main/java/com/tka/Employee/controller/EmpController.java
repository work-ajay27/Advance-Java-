package com.tka.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Employee.DAO.Employee;
import com.tka.Employee.Service.EmpService;


@RestController
@RequestMapping("/api/employees") // base Url
public class EmpController {

	private EmpService empService = null;

	@Autowired
	public EmpController(EmpService empService) {
		this.empService = empService;
	}

//1.	post method
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {

		return empService.saveEmployee(emp);
	}

//2. Fetch All Employees

	@GetMapping("/get")
	public List<Employee> getEmployee() {
		return empService.getAllEmployee();
	}

//3.Delete Employee
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		empService.deleteEmployeeById(id);
	}
	
}
