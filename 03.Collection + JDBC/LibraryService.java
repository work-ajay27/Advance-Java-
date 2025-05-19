package CoreJavaApp;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibraryService {
//Service class

	private List<Book> ArrayListOfbooks;
	/* STEP-2.1 */ private BookDAO SQL_DAO;

	public LibraryService() throws SQLException {
		ArrayListOfbooks = new ArrayList<Book>();
		/* STEP-2.2 */ this.SQL_DAO = new BookDAO();
	}

//	Methods

//	Method-1
	public void addBook(Book books) throws SQLException {
		ArrayListOfbooks.add(books);
//		it will add book in Collection.
//		And We need to store it in MySQL so we need object of BookDAO 
		SQL_DAO.addBook(books);
	}

//	Method-2 

	public List<Book> getAllBooks() throws SQLException {
		ArrayListOfbooks = SQL_DAO.getBooks();
		return ArrayListOfbooks;
	}

	public void closeConnection() throws SQLException {
		SQL_DAO.close();
	}
}
