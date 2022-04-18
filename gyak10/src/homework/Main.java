package homework;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println("It runs, lucky but funnz");
		
		UniEmployee[] employees = new UniEmployee[5];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = GenerateEmployee();
		}
		
		System.out.println(Arrays.toString(employees));
	}
	
	public static UniEmployee GenerateEmployee() {
		Position position = Position.values()[(int)(Math.random() * Position.values().length)];
		String name = Person.Names[(int)(Math.random() * Person.Names.length)];
		String workplace = "Uni of Miskolc";
		int age = 20 + (int)(Math.random() * 50);
		return new UniEmployee(name, age, workplace, position);
	}
	
}
