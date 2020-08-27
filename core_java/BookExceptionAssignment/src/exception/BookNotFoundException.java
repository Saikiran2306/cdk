package exception;

public class BookNotFoundException extends Exception {

	private String message;

	public BookNotFoundException() {
		super();
	}

	public BookNotFoundException(String message) {
		super(message);
		this.message = message;
	}

}
