package book;

public class BookStore {

	public Book[] getBooks() {

		Book books[] = new Book[4];
		books[0] = new Book(123456, "Spring boot", 500);
		books[1] = new Book(123457, "Core Java", "Prentice Hall", "Cay S. Horstmann");
		books[2] = new Book(123458, "Java Complete Reference", 200, "McGraw Hill Education", "Herbert Schildt");
		books[3] = new Book(123459, "Head First Java", 450, "O’Reilly", "Kathy Sierra");

		return books;
	}

	public Book findBookById(long id) {
		Book book = null;
		for (Book obj : getBooks()) {
			if (obj.getiSBN() == id) {
				book = obj;
				break;
			}
		}
		return book;
	}

	public Book updateBook(long id, double price) {
		Book book = findBookById(id);
		if (book != null) {
			book.setPrice(price);
		}
		return book;
	}

}
