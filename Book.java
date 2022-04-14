package Assign;

public class Book {
	private int id;
	private String name;
	private String author;
	private String language;
	private double price;
	private int date;
	private String ISBN;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, String author, String language, double price, int date, String iSBN) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.language = language;
		this.price = price;
		this.date = date;
		this.ISBN = iSBN;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", language=" + language + ", price="
				+ price + ", publishDate=" + date + ", ISBN=" + ISBN + "]";
	}
	
	
	

}
