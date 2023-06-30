package literarySource;

public abstract class LiterarySource {
	private String title;

public LiterarySource(String title) {
		this.title = title;
	}
	
	public LiterarySource() {
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
