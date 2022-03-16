package me.gyak;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    String name;
    LocalDate birthday;
    int salary;

    static final int retireAge = 65;
    
    private static String[] monthNames;
    static {
    	monthNames = new String[] {
    			" ",
    			"január",
    			"február",
    			"március",
    			"április",
    			"május",
    			"június",
    			"július",
    			"augusztus",
    			"szeptember",
    			"október",
    			"november",
    			"december"
    	};
    }
    
    public Employee(String name, LocalDate birthday, int salary){
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }
    
    public Employee(String name, int year, int month, int day){
    	this.name = name;
    	this.birthday = LocalDate.of(year, month, day);
    	this.salary = 10000*(LocalDate.now().getYear() - birthday.getYear());
    }

    public Employee(String name, int year, String month, int day){
    	this(name, year, monthNameToNumber(month), day);
    }
    
    public static int monthNameToNumber(String monthName) {
    	for (int i = 0; i < monthNames.length; i++) {
    		if (monthName == monthNames[i]) {
    			return i;
    		}
    	}
    	return 1;
    }
    
    public static String monthNumberToString(int index) {
    	return monthNames[index];
    }

    public static Employee getFirstRetiree(Employee a, Employee b){
        return a.getYearsUntilRetire() > b.getYearsUntilRetire() ? a : b;
    }
    
    public int getAge() {
    	return birthday.until(LocalDate.now()).getYears();
    }

    public int getYearsUntilRetire(){
        return retireAge - getAge();
    }

    @Override
    public String toString(){
        return name + ": " + getAge() + " years old, " + salary + "Ft, retires in " + getYearsUntilRetire() + "years.";
    }
}
