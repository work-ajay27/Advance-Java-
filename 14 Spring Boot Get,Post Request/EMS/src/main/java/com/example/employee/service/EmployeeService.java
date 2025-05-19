package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository empRepo = null;

	@Autowired // it is use for creating the object of EmployeeRepository Interface.
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;

	}

//	Add EMployee

	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

//	We want the list of All the Employees.
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

//	Delete Employee By iD

	public void deleteEmployeeByID(Long id) {
		empRepo.deleteById(id);
	}
	
}