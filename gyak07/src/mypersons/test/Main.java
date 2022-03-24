package mypersons.test;

import mypersons.Adult;
import mypersons.Child;
import mypersons.Employee;
import mypersons.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int count = readInt("Hany szemelyt olvassunk be?");
        Person[] people = new Person[count];
        for (int i = 0; i < people.length; i++){
            people[i] = readPerson();
        }
        minSelectionSort(people, (a, b) -> Integer.compare(a.getAge(), b.getAge()));

        System.out.println(Arrays.toString(people));
        Person person1 = readPerson();
        Person person2 = readPerson();
        System.out.println("1 child: " + (person1 instanceof Child));
        System.out.println("2 child: " + (person2 instanceof Child));

    }

    public static <T> void minSelectionSort(T[] elements, Comparator<T> comparator){
        for (int i = 0; i < elements.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++){
                if (comparator.compare(elements[minIndex], elements[j]) > 0){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                T temp = elements[i];
                elements[i] = elements[minIndex];
                elements[minIndex] = temp;
            }
        }
    }

    public static Person readPerson(){
        Person person = null;
        while (person == null){
            System.out.println("Adja meg egy szemely adatait (nev, kor, <munkahely/iskola>): ");
            try {
                String line = scanner.nextLine();
                String[] segments = line.split(", ");
                int age = Integer.parseInt(segments[1]);
                if (age < 18){
                    person = new Child(segments[0], age, segments[2]);
                    continue;
                }

                person = segments.length > 2 ?
                        new Employee(segments[0], age, segments[2], readInt("Adja meg a fizeteset")) :
                        new Adult(segments[0], age, "");

            }
            catch (Exception e){
                System.out.println("Nope");
            }
        }
        return person;
    }

    public static int readInt(String prompt){
        Integer number = null;
        while (number == null){
            System.out.println(prompt);
            if (scanner.hasNextInt()){
                number = scanner.nextInt();
            }
            else {
                System.out.println("Nemszam");
            }
            scanner.nextLine();
        }
        return number;
    }



}
