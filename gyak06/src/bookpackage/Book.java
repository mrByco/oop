package bookpackage;

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

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void changePriceByPercent(int percent){
        price += (price * percent / 100);
    }

    @Override
    public String toString(){
        return getDescription();
    }

    public String getDescription(){
        return "Title: " + this.title + " Author: " + title + " Price: " + this.price + " Release date: " + this.releaseDate + " Page count: " + pageCount + " Publisher: " + publisher;
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
}