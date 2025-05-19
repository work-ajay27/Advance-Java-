package sms;

import java.sql.SQLException;

public class StudentsController {

	StudentService studentservice = new StudentService();

	public void createStudent(int id, String name) throws SQLException {

		Student student = new Student(id, name);
		studentservice.registerStudent(student);
		System.out.println("Student has been added");

	}

	public void showAllStudents() throws SQLException {
		System.out.println("All details are :");
		for (Student stu : studentservice.getStudents()) {
			System.out.println(stu);
		}
	}
}
