package me.task3;

import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        try {
            Integer.parseInt("aad");

            Person p = null;
            System.out.println(p.getName());
        } catch (NumberFormatException exception){
            exception.printStackTrace();
        }

        Person person = readPerson();
        System.out.println(person.getDescription());
    }

    public static Person readPerson(){
        Person person = new Person();
        person.setName(readString("Persons name: "));
        person.setWeight(readInt("Persons weight (integer): "));
        person.setHeight(readDouble("Persons height in meter (floating point eq: 1,72): "));
        return person;
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

    public static double readDouble(String prompt){
        Double number = null;
        System.out.println(prompt);
        while (number == null){
            if (!scanner.hasNextDouble()){
                System.out.println("Wrong format! ;(");
                scanner.nextLine();
                continue;
            }
            number = scanner.nextDouble();
            scanner.nextLine();
        }
        return number;
    }

    public static String readString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
