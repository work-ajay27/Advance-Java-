package com.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;

//1.Save Student
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

//	2.Retrive Student Info
	public List<Student> getStudentInfo() {
		return studentRepo.findAll();
	}

//	3. Update Student Info

	public Student updateStudentInfoById(Student updateStudent, int id) {

		Student updatedStudent = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

//		update Student Info
		updatedStudent.setName(updateStudent.getName());
		updatedStudent.setEmail(updateStudent.getEmail());

		return studentRepo.save(updatedStudent);
	}

	public void deleteStudentById(int id) {

		Student Student = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
		studentRepo.deleteById(id);

	}

}
