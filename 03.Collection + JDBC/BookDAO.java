package CoreJavaApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//DAO Class [Database Access Object]
public class BookDAO {

	private Connection connection;

//	Step-1 create Connection Object
	public BookDAO() throws SQLException {

		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/librarymanagement";

		connection = DriverManager.getConnection(url, username, password);
	}
	
	public void addBook(Book books) throws SQLException {
		String Query = "insert into books (Title,Author,PublishYEAR) values (?,?,?)"; // prepared Statement
		PreparedStatement pstatement = connection.prepareStatement(Query);

//		pstatement.setInt(1, books.getID());
		pstatement.setString(1, books.getName());
		pstatement.setString(2, books.getAuthor());
		pstatement.setInt(3, books.getPublishYear());

		pstatement.executeUpdate();
		

	}

//	to Print the Data of Books

	public List<Book> getBooks() throws SQLException {

		List<Book> ArrayListOfBooks = new ArrayList<Book>();
		Statement stmt = connection.createStatement(); // use for executing non paremetized Query
		String Query = "select * from Books";
		ResultSet rs = stmt.executeQuery(Query);

		while (rs.next()) {
			Book book = new Book(rs.getInt("ID"), rs.getString("Title"), rs.getString("Author"),
					rs.getInt("PublishYEAR"));
			ArrayListOfBooks.add(book);
		}
		return ArrayListOfBooks;

	}

	public void close() throws SQLException {
		connection.close();

	}

}
