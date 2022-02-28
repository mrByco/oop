package me.task1;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        tryEmployeeFeatures();
        Employee[] employees = readEmployees(5);
        printEmployees(employees);
        printEmployeeWithMaxSalary(employees);
        printEmployeeCountWithSalaryRange(employees, 150, 350);
        printAverageSalary(employees);
        printTaxSum(employees);
    }

    public static void printTaxSum(Employee[] employees){
        double taxSum = 0;
        for (Employee e : employees){
            taxSum += e.getTax();
        }
        System.out.println("All tax payed: " + taxSum);
    }

    public static void printAverageSalary(Employee[] employees){
        double sum = 0;
        for (Employee e : employees){
            sum += e.getSalary();
        }
        System.out.println("Average salary: " + sum / employees.length);
    }

    public static void printEmployeeCountWithSalaryRange(Employee[] employees, int min, int max){
        int count = 0;
        for (Employee employee : employees){
            if (employee.isSalaryInRange(min, max)) count++;
        }
        System.out.println(count);
    }

    public static void printEmployeeWithMaxSalary(Employee[] employees){
        Employee richest = employees[0];
        for (Employee e : employees){
            if (richest.getSalary() > e.getSalary()) richest = e;
        }
        System.out.println("The richest employee: " + richest.getName());

        // Arrays.sort(e, (e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()));
        // System.out.println(e[0].getDescription());
    }

    public static void printEmployees(Employee[] employees){
        for (Employee e : employees){
            System.out.println(e.getDescription());
        }
        //Lambda bullshit
        //Arrays.asList(employees).forEach(e -> System.out.println(e.getDescription()));
    }

    public static void tryEmployeeFeatures(){
        Employee myFirstEverEmployee = makeEmployee("Me", 350);
        System.out.println(myFirstEverEmployee.getDescription());
        myFirstEverEmployee.addSalary(300);
        System.out.println(myFirstEverEmployee.getDescription());


        System.out.println("Tax: " + myFirstEverEmployee.getTax());
        int minSal = 250, maxSal = 350;
        System.out.println("His salary is: " + minSal +  " > " + myFirstEverEmployee.isSalaryInRange(minSal, maxSal) + " < " + maxSal);

        Employee friend = makeEmployee("Dzsipoo", 700);
        System.out.println(friend.isEmployeeMoreDzsukkerThan(myFirstEverEmployee));
    }


    public static Employee makeEmployee(String name, int salary){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setSalary(salary);
        return employee;
    }

    public static Employee[] readEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            System.out.println("" + i + ". employee");
            employees[i] = readEmployee();
        }
        return employees;
    }

    public static Employee readEmployee(){
        return makeEmployee(readString("Employee name: "), readNumber("Salary: "));
    }

    public static int readNumber(String prompt){
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

    public static String readString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }


}
