package mypersons.test;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Person;

import java.util.Scanner;

public class PersonTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Person person1 = readPerson();
        Person person2 = readPerson();
        System.out.println("1 child: " + (person1 instanceof Child));
        System.out.println("2 child: " + (person2 instanceof Child));

    }

    public static Person readPerson(){
        Person person = null;
        while (person == null){
            System.out.println("Adja meg egy szemely adatait (nev, kor, munkahely/iskola): ");
            try {
                String line = scanner.nextLine();
                String[] segments = line.split(", ");
                int age = Integer.parseInt(segments[1]);
                person = age < 18 ?
                        new Child(segments[0], age, segments[2]) :
                        new Adult(segments[0], age, segments[2]);
            }
            catch (Exception e){
                System.out.println("Nope");
            }
        }
        return person;
    }


}
