package com.tka.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.sms.model.Student;
import com.tka.sms.repository.StudInterface;

@Service
public class StudentService {

	private final StudInterface studInterface;

	@Autowired
	StudentService(StudInterface studInterface) {
		this.studInterface = studInterface;
	}

//	Add Student Info. 

	public Student addStudentIntoDatabase(Student stud) {

		Student saveStudent = studInterface.save(stud);
		return saveStudent;
	}

//	Show Student Info. 
	public List<Student> displayAllStudent() {
		List<Student> studInfo = studInterface.findAll();
		return studInfo;
	}

//	Update Student Info.
	public Student updateStudentInfo(Integer ID, Student updateStud) {
		Student existingStudent = studInterface.findById(ID).orElse(null);

		if (existingStudent != null) {
			existingStudent.setName(updateStud.getName());
			existingStudent.setAge(updateStud.getAge());
			existingStudent.setSchoolName(updateStud.getSchoolName());

			return studInterface.save(existingStudent);
		}
		return null;
	}

//	Delete Student Info. from Database
	public void deleteStudentById(int id) {
		studInterface.deleteById(id);
	}

}
