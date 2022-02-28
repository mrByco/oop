package me.task1;

import me.Rectangle;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3, 5);
        Rectangle rect2 = new Rectangle(5, 2);
        Rectangle rect3 = rect1;

        printRect(rect1);
        printRect(rect2);
        printRect(rect3);

        rect1.setSides(8, 8);

        printRect(rect1);
        printRect(rect2);
        printRect(rect3);

        rect1.setSides(5, 2);

        System.out.println("rect1 == rect2: " + (rect1 == rect2));
        System.out.println("rect1 == rect3: " + (rect1 == rect3));
        System.out.println("rect2.equals(rect1): " + rect2.equals(rect1));

    }

    public static void printRect(Rectangle rect){
        System.out.println(rect.getRectangleString());
    }
}
