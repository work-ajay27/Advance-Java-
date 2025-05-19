package CoreJavaApp;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LibraryApplication {
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Hii..");
		LibraryService libraryservice = new LibraryService();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome Library Management System");
		boolean exit = false;

		while (!exit) { // run until exit ==true
			System.out.println("1.Add Book");
			System.out.println("2.Display All Books");
			System.out.println("3.Exit");

			System.out.println("Enter Your Choice ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter Book Title");
				String title = sc.nextLine();
				System.out.println("Enter Book Author Name");
				String AuthorName = sc.nextLine();
				System.out.println("Enter Book Publish Year");
				int PublishYear = sc.nextInt();

				Book newBook = new Book(0, title, AuthorName, PublishYear);
				libraryservice.addBook(newBook);
				System.out.println("New Book Has Been Added.");
				break;

			case 2:
				List<Book> book = libraryservice.getAllBooks();
				if (book.isEmpty()) {
					System.out.println("No Book Available");
				} else {
					book.forEach(System.out::println); // <---------------

				}
				break;

			case 3:
				exit = true;
				libraryservice.closeConnection();
				System.out.println("Exiting from the System");

				break;

			default: {
				System.out.println("Invalid choice");
			}
			}

		}
	}
}
