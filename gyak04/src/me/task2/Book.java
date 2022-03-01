package me.task2;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int releaseDate;
    private int price;

    Book(String title, String author, int releaseDate, int price){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    Book(String title, String author){
        this(title, author, LocalDate.now().getYear(), 2500);
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

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
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
        return "Title: " + this.title + " Author: " + title + " Price: " + this.price + " Release day: " + this.releaseDate;
    }
}
