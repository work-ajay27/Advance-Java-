package collection;
import java.util.ArrayList;
import java.util.List;

public class Library {
//***	Step-1  ***


	private List<Book> ListOfBooks;

	// *** Step-2 ***

	public Library() {
		ListOfBooks = new ArrayList<Book>();

	}

	// *** Step-3 ***
	
	public void addBook(Book book) {
		ListOfBooks.add(book);

	}

	// *** Step-4 ***

//	Methods to Display Books in Library
	public void displayAllBooks() {

		if (ListOfBooks.isEmpty()) {
			System.out.println("No Books in the Library. ");
		} else {
//			is use to print the list of Books
			for (Book book : ListOfBooks) {
				System.out.println(book);
				System.out.println("**************");
				
				
			}
		}
	}

}
