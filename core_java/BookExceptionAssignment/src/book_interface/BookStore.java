package book_interface;

import book.Book;

public interface BookStore {

	Book[] getBooks();

	Book findBookById(Book books[], long id);

	Book findBookByName(Book books[], String name);

	Book updateBook(Book books[], long id, double price);

	default void displayBooks(Book books[]) {
		
		if(books!=null)
		{
		for (Book book : books) {
			System.out.println(book);
		}
		}
		else
		{
			System.out.println("Books not present");
		}
	}

}
