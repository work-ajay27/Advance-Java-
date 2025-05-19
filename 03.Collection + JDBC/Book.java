package CoreJavaApp;

public class Book {
	
//	It is a Model Class or Entity Class.
	private int ID;
	private String name;
	private String Author;
	private int PublishYear;

//	Constructor
	public Book(int iD, String name, String author, int publishYear) {
		super();
		ID = iD;
		this.name = name;
		Author = author;
		PublishYear = publishYear;
	}

//	Getter and Setter
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPublishYear() {
		return PublishYear;
	}

	public void setPublishYear(int publishYear) {
		PublishYear = publishYear;
	}

	@Override
	public String toString() {
		return "Book [ID=" + ID + ", name=" + name + ", Author=" + Author + ", PublishYear=" + PublishYear + "]";
	}

}
