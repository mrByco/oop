package me.task2;

public class Book {
    private String title;
    private String author;
    private int releaseData;
    private int price;

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

    public int getReleaseData() {
        return releaseData;
    }

    public void setReleaseData(int releaseData) {
        this.releaseData = releaseData;
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

    public String getBookDescription(){
        return "";
    }
}
