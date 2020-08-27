package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import book.Book;
import book_interface.BookStore;
import book_interface.BookStoreImpl;
import exception.BookNotFoundException;

public class TestBook {

	public static void main(String[] args) {
		BookStore bookStoreImpl = new BookStoreImpl();

		Book books[] = bookStoreImpl.getBooks();
		if (books != null) {
			BufferedReader br = null;
			try {
				while (true) {
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.println(
							"\n 1.Find by id \n 2.Find by name \n 3. Update book price \n 4 Display all books \n 5. Exit \n");
					System.out.println("Enter your choice");
					int no = Integer.parseInt(br.readLine());
					switch (no) {

					case 1:
						System.out.println("Enter book id to find");
						long id = Long.parseLong(br.readLine());
						Book book = bookStoreImpl.findBookById(books, id);
						if (book == null) {

							throw new BookNotFoundException("Book not found");
						}

						else {
							System.out.println(book);
						}
						break;

					case 2:
						System.out.println("Enter book name to find");
						String name = br.readLine();
						book = bookStoreImpl.findBookByName(books, name);
						if (book == null) {

							throw new BookNotFoundException("Book not found");

						} else {
							System.out.println(book);
						}
						break;

					case 3:
						System.out.println("Enter book id and new price to update book");
						System.out.println("Enter book id to find");
						id = Long.parseLong(br.readLine());
						book = bookStoreImpl.findBookById(books, id);
						if (book == null) {
							throw new BookNotFoundException("Book not found");
						} else {
							System.out.println("Enter the new price");
							Double price = Double.parseDouble(br.readLine());
							book = bookStoreImpl.updateBook(books, id, price);
							if (book == null) {
								throw new BookNotFoundException("Book not found");

							} else {
								System.out.println(book);
							}
						}
						break;

					case 4:
						bookStoreImpl.displayBooks(books);
						break;

					case 5:
						System.out.println("Exited...");
						System.exit(0);
						break;
					default:
						System.out.println("Entered invalid choice");
						break;

					}
				}

			} catch (BookNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		} else {
			System.out.println("Books not created");
		}

	}

}
