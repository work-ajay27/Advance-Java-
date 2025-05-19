package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.dao.Employee;

//1. "EmployeeRepository is using all the methods from JpaRepository 
//to work with the Employee entity whose primary key (ID) type is Long."

//2. in JPA Repository is use for:  we don't need write the CRUD Operation. It will do it automatically.


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}








// Why is Repository used in Spring Boot?
//Repository is used to perform CRUD operations 
//(Create, Read, Update, Delete) on the database without writing SQL code manually.


//What can it do?

//Operation	       Method Provided By Repository

//Create	         save()
//Read (Get)	     findAll(), findById()
//Update	          save()
//Delete	        deleteById()