package com.tka.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.employee.dao.Employee;
import com.tka.sms.model.Student;
import com.tka.sms.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudController {

	private StudentService studService;

	@Autowired
	public StudController(StudentService studService) {
		this.studService = studService;
	}

//	Post Request 
	@PostMapping
	public Student addStudent(@RequestBody Student stud) {
		Student studObj = studService.addStudentIntoDatabase(stud);
		return studObj;
	}

//	Get Request 
	@GetMapping
	List<Student> getStudentDetails() {
		return studService.displayAllStudent();
	}

//	Put : use to update the information
	@PutMapping("/{id}")
	public String updateStudent(@PathVariable Integer id, @RequestBody Student stud) {
		Student updated = studService.updateStudentInfo(id, stud);

		if (updated != null) {
			return "The User with ID " + id + " Updated Successfully";
		} else {
			return "User with ID " + id + " Not Found";
		}

	}

//	delete request :
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		studService.deleteStudentById(id);
		return "Student Deleted Succesfully";
	}
//	"Student Deleted Succesfully" => This message is shown in Postman
}
