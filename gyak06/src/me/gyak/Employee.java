package me.gyak;

public class Employee {
    String name;
    int age;
    int salary;

    static int retireAge;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    Employee(String name, int age){
        this(name, age, age * 10000);
    }

    public static Employee getFirstRetiree(Employee a, Employee b){
        return a.getYearsUntilRetire() > b.getYearsUntilRetire() ? a : b;
    }

    public static void setRetireAge(int age){
        retireAge = age;
    }

    public int getYearsUntilRetire(){
        return retireAge - age;
    }

    @Override
    public String toString(){
        return name + ": " + age + " years old, " + salary + "Ft, retires in " + getYearsUntilRetire() + "years.";
    }
}
