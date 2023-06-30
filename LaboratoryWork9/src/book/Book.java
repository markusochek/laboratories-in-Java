package book;

import literarySource.LiterarySource;

public class Book extends LiterarySource {
	private String author;
	private int yearOfPublication;
	private String publishingHouse;
	
	public Book(String title, String author, int yearOfPublication, String publishingHouse) {
		super(title);
		this.author = author;
		this.yearOfPublication = yearOfPublication;
		this.publishingHouse = publishingHouse;
	}
	
	public Book() {	
	}
	
	public int getYearOfPublication() {
		return yearOfPublication;
	}
	
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	
	public String getPublishingHouse() {
		return publishingHouse;
	}
	
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "{" +
			super.getTitle() + ", " +
			author + ", " +
			yearOfPublication + ", " +
			publishingHouse +
			"}";
	}
	
}
