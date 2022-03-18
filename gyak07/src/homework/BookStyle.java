package homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookStyle extends Book {
    String style;

    public BookStyle(String title, String author, int price, int pageCount, String publisher, String style) {
        super(title, author, price, pageCount, publisher);
        this.style = style;
    }

    @Override
    public String toString(){
        return super.toString() + " - " + style;
    }

    public static int getDifferentBookStyles(BookStyle[] books){
        ArrayList<String> styles = new ArrayList<String>();
        for (BookStyle book : books){
            boolean contains = false;
            for (String str : styles){
                if (str.equalsIgnoreCase(book.style)){
                    contains = true;
                    break;
                }
            }
            if (!contains) styles.add(book.style);
        }
        return styles.size();
    }

    public static BookStyle[] getAllBookWithStyle(String styleName, BookStyle[] books){
        int count = 0;
        for (BookStyle bookStyle : books){
            if (bookStyle.style.equalsIgnoreCase(styleName)){
                count++;
            }
        }
        BookStyle[] filtered = new BookStyle[count];
        count = 0;
        for (BookStyle bookStyle : books){
            if (bookStyle.style.equalsIgnoreCase(styleName)){
                filtered[count] = bookStyle;
                count++;
            }
        }
        return filtered;
    }



}
