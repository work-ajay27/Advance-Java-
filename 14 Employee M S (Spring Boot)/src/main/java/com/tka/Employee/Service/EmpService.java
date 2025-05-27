package com.tka.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Employee.DAO.Employee;
import com.tka.Employee.Repository.EmployeeRepository;

@Service
public class EmpService {
	private EmployeeRepository empRepo = null;

	@Autowired // Not Understand
	EmpService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}

//1.	Save employee Object
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

//	2.Fetch Employeee List

	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

//	3.Delete Employee Based On Id;
	public void deleteEmployeeById(int id) {
		empRepo.deleteById(id);
	}

}
