package Course_Details;

public class Textbook {
	String title;
	String author;
	String publisher;

	public Textbook() {
		title = null;
		author = null;
		publisher = null;
	}

	public Textbook(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public Textbook setTitle(String title) {
		this.title = title;
		return this;
	}

	public Textbook setAuthor(String author) {
		this.author = author;
		return this;
	}

	public Textbook setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

}
