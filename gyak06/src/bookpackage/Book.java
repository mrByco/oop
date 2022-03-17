package homework;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private final int releaseDate = LocalDate.now().getYear();
    private int price;
    private int pageCount;
    private String publisher;

    Book(String title, String author, int price, int pageCount, String publisher){
        this.title = title;
        this.author = author;
        this.price = price;
        this.pageCount = pageCount;
        this.publisher = publisher;
    }

    Book(String title, String author, int pageCount){
        this(title, author,  2500, pageCount, "Móra");
    }
    

    public Book(String author, String title, int price, int pageCount){
        this(title, author,  Math.max(0, price), Math.max(pageCount, 0), "Móra");
    }

    public Book(String author, String title) {
    	this.title = title;
    	this.author = author;
    	this.pageCount = 100;
    	this.publisher = "Mora";
    	this.price = 2500;
	}

	public static Book getLongerBook(Book a, Book b){
        return a.pageCount > b.pageCount ? a : b;
    }

    public boolean isEvenPaged(){
        return pageCount % 2 == 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return releaseDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.max(1000, price);
    }

    public void increasePrice(int percent){
    	if (percent < 0) return;
        price += Math.round(price * (float)percent / 100.0);
    }

    @Override
    public String toString(){
        return getDescription();
    }

    public String getDescription(){
        return "Title: " + this.title + " Author: " + author + " Price: " + this.price + " Release date: " + this.releaseDate + " Page count: " + pageCount + " Publisher: " + publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

	public Integer getPages() {
		return this.getPageCount();
	}

	public void setPages(int setPages) {
		if (setPages < 0) return;
		this.setPageCount(setPages);
		
	}

	public static Book getLonger(Book book, Book book2) {
		return book.getPageCount() >= book2.getPageCount() ? book : book2;
	}

	public boolean hasEvenPages() {
		return this.getPageCount() % 2 == 0;
	}

	public static Book getLongestBook(Book[] books) {
		Book longestBook = books[0];
		for (Book book : books) {
			if (book.getPageCount() > longestBook.getPageCount()) {
				longestBook = book;
			}
		}
		return longestBook;
	}
	


    public static Book getLongestEvenPagesBook(Book[] books) {
        Book longest = null;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPageCount() % 2 == 0 &&
                    (longest == null || books[i].getPageCount() > longest.getPageCount())) {
                longest = books[i];
            }
        }
        return longest;
    }
}
