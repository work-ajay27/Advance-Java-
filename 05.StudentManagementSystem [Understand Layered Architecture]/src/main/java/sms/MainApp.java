package sms;

import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
		System.out.println("Hello");
		StudentsController controller = new StudentsController();
		controller.createStudent(10, "Ajay");
		controller.createStudent(20, "Rahul");
		controller.createStudent(30, "Sahil");
		controller.createStudent(40, "Dipak");

		controller.showAllStudents();
	}
}
