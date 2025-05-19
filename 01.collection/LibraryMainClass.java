package collection;
public class LibraryMainClass {

	public static void main(String[] args) {
		// *** Step-5 *** (Create a Library) to adds books into it.

		Library library = new Library();
//		This Object will call the constructor in Library class and create the array List (step 2)

//	 *** Step-6 *** //		Adds Books to the Library

//		To add book in the Library we need a book. so we create the object of Book Class.

		Book book1 = new Book("Data Structures", "Striver", 1);
		Book book2 = new Book("C-Language", "Dennis Ritchie", 2);
		Book book3 = new Book("Python", "Danish Bhai", 3);
		Book book4 = new Book("Atomic Habit", "James Clear", 4);

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);

//		//	 *** Step-7 *** //	 is usr to display the Books.
		library.displayAllBooks();
	}

}
