package Test2;

public class Books {
	private int isbn;
	private String title;
	private int pages;
	private String pub_year;
	private String type;
	private Author Author;
	private Publisher publisher;

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Author getAuthor() {
		return Author;
	}
	public void setAuthor(Author author) {
		Author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	
	public String getPub_year() {
		return pub_year;
	}
	public void setPub_year(String pub_year) {
		this.pub_year = pub_year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", title=" + title + ", pages=" + pages + ", Author=" + Author
				+ ", publisherName=" + publisher + "]";
	}
	
	public Books(int isbn, String title, int pages,String pub_year, String type, Author author, Publisher publisher) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pages = pages;
		this.pub_year = pub_year;
		this.type = type;
		this.Author= Author;
		this.publisher = publisher;
	
	}
	
	
	

}
