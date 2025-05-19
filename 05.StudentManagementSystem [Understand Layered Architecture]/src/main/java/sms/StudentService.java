package sms;

import java.sql.SQLException;
import java.util.List;

public class StudentService {
	StudentDAO studDAO = new StudentDAO();

	public void registerStudent(Student student) throws SQLException {

		if (student.getName() != null && !student.getName().isEmpty() && student.getId() > 0) {
//			 The ! (NOT) operator reverses the condition, meaning the name should NOT be empty.
			studDAO.addStudents(student);
		} else {
			System.out.println("Invalid Student details");
		}

	}

//	Fetch students details

	public List<Student> getStudents() throws SQLException {
		return studDAO.getAllStudents();

	}

}
