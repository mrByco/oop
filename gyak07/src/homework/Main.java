package homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int bookCount = readInt("How many books do we have?", 1, 10);

        BookStyle[] books = new BookStyle[bookCount];
        for (int i = 0; i < books.length; i++) {
            books[i] = readBook();
        }

        System.out.println("Books with different styles: " + BookStyle.getDifferentBookStyles(books));
        System.out.println("Books of type 'scifi': " + Arrays.toString(BookStyle.getAllBookWithStyle("Scifi", books)));
        float average = 0;
        for (BookStyle style : BookStyle.getAllBookWithStyle("Scifi", books)){
            average += style.getPrice();
        }
        average = (float)average / BookStyle.getAllBookWithStyle("Scifi", books).length;
        System.out.println("Average price of type 'scifi': " + average);


    }

    public static BookStyle readBook() {
        String title = readString("Title: ");
        String author = readString("Author: ");
        int length = readInt("Page count: ", null, null);
        int price = readInt("Price: ", null, null);
        String style = readString("Style: ");
        return new BookStyle(title, author, price, length, "Móra", style);
    }

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt, Integer min, Integer max) {
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
            if ((min != null && number < min) || (max != null && number > max)){
                number = null;
                System.out.println("Wrong number! ;(");
            }
        }
        return number;
    }
}