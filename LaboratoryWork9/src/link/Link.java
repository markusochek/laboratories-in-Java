package link;

import java.time.LocalDate;

import literarySource.LiterarySource;

public class Link extends LiterarySource {
	private String URL;
	private LocalDate dateOfApplication;
	
	public Link(String title, String URL, LocalDate dateOfApplication) {
		super(title);
		this.URL = URL;
		this.dateOfApplication = dateOfApplication;
	}
	
	public Link() {	
	}
	
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	
	@Override
	public String toString() {
		return "{" +
			super.getTitle() + ", " +
			URL + ", " +
			dateOfApplication +
			"}";
	}
}
