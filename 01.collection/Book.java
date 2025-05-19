package collection;
public class Book {
//	Instance variable 
	private String Title;
	private String Author;
	private int BookNo;

//	Constructor
	public Book() {
		super();
	}

//	Parameterized Constructor
	public Book(String title, String author, int bookNo) {
		super();
		Title = title;
		Author = author;
		BookNo = bookNo;
	}

//	Getter Methods
	public String getTitle() {
		return Title;
	}

	public String getAuthor() {
		return Author;
	}

	public int getBookNo() {
		return BookNo;
	}

//	toString() Method 

	@Override
	public String toString() {
		return "Books [Title=" + Title + ", Author=" + Author + ", Book No=" + BookNo + "]";
	}

}
