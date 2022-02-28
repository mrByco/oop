package me.task3;

import java.util.Scanner;

@SuppressWarnings("all")
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int diskCount = readInt("How many disks we have?");
        Disk[] disks = new Disk[diskCount];
        for (int i = 0; i < disks.length; i++) {
            disks[i] = readDisk();
        }

        System.out.println("Longest disk: " + getLongestDisk(disks).getInString());
        printDisksOfAuthor(disks);
    }

    private static void printDisksOfAuthor(Disk[] disks) {
        String artist = readString("Author to print: ");
        for (Disk d : disks) {
            if (d.getArtist().equalsIgnoreCase(artist)) {
                System.out.println("    - " + d.getInString());
            }
        }
    }

    public static Disk getLongestDisk(Disk[] disks) {
        Disk longest = null;
        for (Disk d : disks) {
            if (longest == null || longest.getLength() < d.getLength()) longest = d;
        }
        return longest;
    }

    public static Disk readDisk() {
        String title = readString("Title: ");
        String author = readString("Author: ");
        int length = readInt("length: ");
        return new Disk(title, author, length);
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
