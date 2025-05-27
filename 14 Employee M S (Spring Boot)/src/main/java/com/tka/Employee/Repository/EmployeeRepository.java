package com.tka.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Employee.DAO.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
