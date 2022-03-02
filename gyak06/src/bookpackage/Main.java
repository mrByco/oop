package bookpackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int bookCount = readInt("How many books we have?");

        Book[] books = new Book[bookCount];
        for (int i = 0; i < books.length; i++) {
            books[i] = readBook();
        }


        /* Book[] books = new Book[]{
                new Book("asd", "1", 34),
                new Book("gg", "1", 12),
                new Book("wp", "13", 34),
                new Book("asd", "3", 24),
                new Book("dfg", "3", 677),
        }; */

        System.out.println("Longest book: " + getLongestBook(books).getDescription());
        System.out.println("Longest even paged: " + books[getLongestEvenPagedBookIndex(books)].getDescription());
        printAuthorBookCount(books);


    }

    public static int getLongestEvenPagedBookIndex(Book[] books) {
        int maxIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPageCount() % 2 == 0 &&
                    (maxIndex == -1 || books[i].getPageCount() > books[maxIndex].getPageCount())) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void printAuthorBookCount(Book[] books){
        Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
        for (Book book : books){
            if (dict.containsKey(book.getAuthor())){
                dict.put(book.getAuthor(), dict.get(book.getAuthor()) + 1);
            }else {
                dict.put(book.getAuthor(), 1);
            }
        }

        dict.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }

    public static Book getLongestBook(Book[] disks) {
        Book longest = null;
        for (Book d : disks) {
            if (longest == null || longest.getPageCount() < d.getPageCount()) longest = d;
        }
        return longest;
    }

    public static Book readBook() {
        String title = readString("Title: ");
        String author = readString("Author: ");
        int length = readInt("Page count: ");
        return new Book(title, author, length);
    }

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        Integer number = null;
        System.out.println(prompt);
        while (number == null) {
            if (!scanner.hasNextInt()) {
                System.out.println("Wrong format! ;(");
                scanner.nextLine();
                continue;
            }
            number = scanner.nextInt();
            scanner.nextLine();
        }
        return number;
    }
}
