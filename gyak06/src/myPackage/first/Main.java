package myPackage.first;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import me.gyak.Employee;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 3;
        Employee[] employees = new Employee[]{
                new Employee("Torday Jozsef", 2001, 4, 1),
                new Employee("Kecskes Judit", 1996, 9, 21),
                new Employee("Lakatos Dani", 1942, 5, 2),
                new Employee("Lakatos Erzsike", 1993, 1, 19),
        };

        printEmployees(employees);


        printEmployeesWhoRetiresIn(employees, 5);
        printEmployeesWhoRetiresAfterAverage(employees);
        
        Arrays.sort(employees, (a, b) -> Integer.compare(a.getYearsUntilRetire(), b.getYearsUntilRetire()));
        printEmployees(employees);
        
        Arrays.sort(employees, (a, b) -> Integer.compare(b.getYearsUntilRetire(), a.getYearsUntilRetire()));
        printEmployees(employees);
    }

    private static void printEmployeesWhoRetiresAfterAverage(Employee[] employees) {
        double average = Arrays.stream(employees).mapToInt(Employee::getYearsUntilRetire).reduce(0, Integer::sum) / (double) employees.length;
        System.out.println("Employees who retires after the average: ");
        for (Employee e : employees) {
            if (e.getYearsUntilRetire() > average){
                System.out.println(e);
            }
        }
    }

    private static void printEmployeesWhoRetiresIn(Employee[] employee, int years) {
        System.out.println("Employees who retires in " + years + " years: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getYearsUntilRetire() < years) {
                System.out.println(employee[i]);
            }
        }
    }
    

    private static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static Employee[] readEmployees(int count) {
        System.out.println("Enter " + count + "employee");
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            System.out.println("" + (i + 1) + ".");
            employees[i] = readEmployee();
        }
        return employees;
    }

    public static Employee readEmployee() {
        String name = readString("Give a name to your creation: ");
        int age = readInt("How old is he/she/it?");
        LocalDate birth = LocalDate.now().minusYears(-age);
        return new Employee(name, birth.getYear(), birth.getMonthValue(), birth.getDayOfMonth());
    }

    public static int readInt(String prompt) {
        System.out.println(prompt);
        Integer number = null;
        while (number == null) {
            if (!scanner.hasNextInt()) {
                System.out.println("You missed something bro.. We need a number!");
                scanner.nextLine();
                continue;
            }
            number = scanner.nextInt();
            scanner.nextLine();
        }
        return number;
    }

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
