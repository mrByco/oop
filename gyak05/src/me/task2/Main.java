package me.task2;

import me.Rectangle;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Rectangle[] rectangles = new Rectangle[10];
        fillWithRectangles(rectangles, 2, 10);

        for (Rectangle r : rectangles){
            System.out.println(r.getRectangleString());
        }

        Rectangle smallest = null;
        for (Rectangle r : rectangles){
            if (smallest == null || smallest.getArea() > r.getArea()) smallest = r;
        }
        System.out.println("Smallest rect: " + smallest.getRectangleString());

        Rectangle rect = new Rectangle(readInt("Height of new rect: "), readInt("Width of new rect: "));
        int biggerCount = 0;
        for (Rectangle r : rectangles){
            if (r.getArea() > rect.getArea()) biggerCount++;
        }
        System.out.println("There are " + biggerCount + " larger rectangles than the new one.");

        int firstMatchIndex = getFirstMatchIndex(rectangles, rect);
        if (firstMatchIndex != -1) System.out.println("The first matching rect index: " + firstMatchIndex);
        else System.out.println("No match");

    }

    public static int getFirstMatchIndex(Rectangle[] rectangles, Rectangle matchTo){
        for (int i = 0; i < rectangles.length; i++){
            if (rectangles[i].equals(matchTo)) return i;
        }
        return -1;
    }

    public static void fillWithRectangles(Rectangle[] rectangles, int sideMin, int sideMax){
        for (int i = 0; i < rectangles.length; i++){
            rectangles[i] = generateRectangle(sideMin, sideMax);
        }
    }

    public static Rectangle generateRectangle(int min, int max){
        return new Rectangle((int)Math.round(Math.random() * (max - min) + min), (int)Math.round(Math.random() * (max - min) + min));
    }


    public static int readInt(String prompt){
        Integer number = null;
        System.out.println(prompt);
        while (number == null){
            if (!scanner.hasNextInt()){
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
