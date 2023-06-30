package article;

import literarySource.LiterarySource;

public class Article extends LiterarySource {
	private String author;
	private String nameOfMagazine;
	private int yearOfRelease;
	private int numberOfRelease;
	
	public Article(String title, String author, String nameOfMagazine, int yearOfRelease, int numberOfRelease) {
		super(title);
		this.author = author;
		this.nameOfMagazine = nameOfMagazine;
		this.yearOfRelease = yearOfRelease;
		this.numberOfRelease = numberOfRelease;
	}
	
	public Article() {	
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNameOfMagazine() {
		return nameOfMagazine;
	}
	public void setNameOfMagazine(String nameOfMagazine) {
		this.nameOfMagazine = nameOfMagazine;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public int getNumberOfRelease() {
		return numberOfRelease;
	}
	public void setNumberOfRelease(int numberOfRelease) {
		this.numberOfRelease = numberOfRelease;
	}
	
	@Override
	public String toString() {
		return "{" +
			super.getTitle() + ", " +
			author + ", " +
			nameOfMagazine + ", " +
			yearOfRelease + ", " +
			numberOfRelease +
			"}";
	}

}
