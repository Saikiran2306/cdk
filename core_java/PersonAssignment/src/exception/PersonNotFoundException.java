package exception;

public class PersonNotFoundException extends Exception {

	private String message;

	public PersonNotFoundException() {
		super();
	}

	public PersonNotFoundException(String message) {
		super(message);
		this.message = message;
	}

}
