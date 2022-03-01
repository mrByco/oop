package me.task1;

public class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    Employee(String name) {
        this(name, 250000);
    }

    @Override
    public String toString(){
        return getDescription();
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void addSalary(int salaryDifference){
        this.salary += salaryDifference;
    }

    public String getDescription(){
        return name + ": " + salary + "₽";
    }

    public boolean isSalaryInRange(int min, int max) {
        return salary > min && salary < max;
    }

    public double getTax(){
        return salary * 0.16;
    }

    public boolean isEmployeeMoreDzsukkerThan(Employee fiend){
        return this.salary > fiend.salary;
    }
}
