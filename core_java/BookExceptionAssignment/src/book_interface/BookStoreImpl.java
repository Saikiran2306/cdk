package book_interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import book.Book;

public class BookStoreImpl implements BookStore {

	@Override
	public Book[] getBooks() {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Book books[] = null;
		try {
			System.out.println("Enter the number of books");
			books = new Book[Integer.parseInt(br.readLine())];
			long iSBN;
			String name;
			double price;
			String publication;
			String author;

			for (int i = 0; i < books.length; i++) {
				System.out.println("Enter the book " + (i + 1) + " details");
				System.out.println("Enter book id");
				iSBN = Long.parseLong(br.readLine());
				System.out.println("Enter book name");
				name = br.readLine();
				System.out.println("Enter book price");
				price = Double.parseDouble(br.readLine());
				System.out.println("Enter book publication");
				publication = br.readLine();
				System.out.println("Enter book author");
				author = br.readLine();
				books[i] = new Book(iSBN, name, price, publication, author);
				System.out.println();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public Book findBookById(Book[] books, long id) {
		Book book = null;
		for (Book obj : books) {
			if (obj.getiSBN() == id) {
				book = obj;
				break;
			}
		}
		return book;
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		// TODO Auto-generated method stub
		Book book = null;
		for (Book obj : books) {
			if (obj.getName().equalsIgnoreCase(name)) {
				book = obj;
				break;
			}
		}
		return book;
	}

	@Override
	public Book updateBook(Book[] books, long id, double price) {
		Book book = findBookById(books, id);
		if (book != null) {
			book.setPrice(price);
		}
		return book;
	}

}
