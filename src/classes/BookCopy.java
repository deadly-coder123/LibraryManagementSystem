package classes;

public class BookCopy {

	private int copyNumber;
	private Book book;
	private boolean available;
	
	public BookCopy(Book book, int copyNumber, boolean available) {
		this.copyNumber = copyNumber;
		this.book = book;
		this.available = available;
	}

	public int getCopyNumber() {
		return copyNumber;
	}

	public Book getBook() {
		return book;
	}

	public boolean isAvailable() {
		return available;
	}
	
	
}