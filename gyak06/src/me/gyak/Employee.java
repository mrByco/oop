package me.gyak;

public class Employee {
    String name;
    int birthYear;
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
    
    public Employee(String name, int year, int month, int day, int salary){
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }
    
    

    Employee(String name, int year, int month, int day){

    }

    Employee(String name, int year, String month, int day){
    	//int monthNumber = Arrays.
    }
    
    public static int monthNameToNumber(String monthName) {
    	for (int i = 0; i < monthNames.length; i++) {
    		if (monthName == monthNames[i]) {
    			return i;
    		}
    	}
    	return 0;
    }
    
    public static monthNumberToString(int index) {
    	return monthNames[index];
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
