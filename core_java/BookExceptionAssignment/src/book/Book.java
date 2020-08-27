package book;

public class Book {

	private long iSBN;
	private String name;
	private double price;
	private String publication;
	private String author;

	public Book() {

	}

	public Book(long iSBN, String name, double price) {

		this.iSBN = iSBN;
		this.name = name;
		this.price = price;
	}

	public Book(long iSBN, String name, String publication, String author) {

		this.iSBN = iSBN;
		this.name = name;
		this.publication = publication;
		this.author = author;
	}

	public Book(long iSBN, String name, double price, String publication, String author) {
		super();
		this.iSBN = iSBN;
		this.name = name;
		this.price = price;
		this.publication = publication;
		this.author = author;
	}

	public long getiSBN() {
		return iSBN;
	}

	public void setiSBN(long iSBN) {
		this.iSBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [iSBN=" + iSBN + ", name=" + name + ", price=" + price + ", publication=" + publication
				+ ", author=" + author + "]";
	}

	

}
