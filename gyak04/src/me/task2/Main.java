package me.task2;

public class Main {

    public static void main(String[] args){
        Book book = makeBook("A Gyűrűk Ura", "J. R. R. Tolkien", 10999, 2003);
        System.out.println(book.getDescription());
    }

    public static Book makeBook(String title, String author, int price, int releaseYear){
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        book.setReleaseDate(releaseYear);
        return book;
    }
}
