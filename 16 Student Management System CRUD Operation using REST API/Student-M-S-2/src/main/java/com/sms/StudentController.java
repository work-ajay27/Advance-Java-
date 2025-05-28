package com.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	private StudentService studService;

//	1.Add Student
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studService.saveStudent(student);
	}

//2. View Student
	@GetMapping("/retrive")
	public List<Student> getStudent() {
		return studService.getStudentInfo();
	}

//	3. update Student

	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student updateStudent) {
		Student student = studService.updateStudentInfoById(updateStudent, id);
		return student;
	}

//	Delete Student
	@DeleteMapping("/{id}")

	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		studService.deleteStudentById(id);
		return ResponseEntity.ok("Student Deleted Succesfully");

	}
}
