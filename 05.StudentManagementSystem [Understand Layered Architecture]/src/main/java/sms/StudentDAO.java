package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public void addStudents(Student student) throws SQLException {
//		Add student into Database

		String Query = "insert into Students (studID,studName) values(?,?);";

		Connection connection = DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.user,
				DatabaseConfig.password);

		PreparedStatement preparedstatement = connection.prepareStatement(Query);
		preparedstatement.setInt(1, student.getId());
		preparedstatement.setString(2, student.getName());

		preparedstatement.executeUpdate();

	}

	public List<Student> getAllStudents() throws SQLException {
		List<Student> students = new ArrayList<Student>();
		String Query = "Select * from Students";
		Connection connection = DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.user,
				DatabaseConfig.password);

		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(Query);

		while (rs.next()) {
			int id = rs.getInt("studID"); //studID is database column name
			String name = rs.getString("studName");
			Student student = new Student(id, name);
			students.add(student);

		}

		return students;
	}
}
