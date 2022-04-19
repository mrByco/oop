package homework;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		System.out.println("It runs, lucky but funnz");
		
		UniEmployee[] employees = new UniEmployee[5];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = GenerateEmployee();
		}

		System.out.println(Arrays.toString(employees));

		CountEmployeesByPosition(employees);
		
		Arrays.sort(employees, (a, b) -> Integer.compare(((UniEmployee)a).getAge(), ((UniEmployee)b).getAge()));
		System.out.println(Arrays.toString(employees));
		
	}
	
	public static void CountEmployeesByPosition(UniEmployee[] employees) {
		HashMap<Position, Integer> positions = new HashMap<Position, Integer>();
		for (UniEmployee employee: employees) {
			if (!positions.containsKey(employee.getPosition())) {
				positions.put(employee.getPosition(), 1);
			}
			else {
				positions.put(employee.getPosition(),positions.get(employee.getPosition()) + 1);
			}
		}
		
		for (Position position: Position.values()) {
			if (positions.get(position) == null) {
				System.out.println(position.toString() + ": 0");
			}else {
				System.out.println(position.toString() + ": " + positions.get(position).toString());
			}
		}
	}
	
	public static UniEmployee GenerateEmployee() {
		Position position = Position.values()[(int)(Math.random() * Position.values().length)];
		String name = Person.Names[(int)(Math.random() * Person.Names.length)];
		String workplace = "Uni of Miskolc";
		int age = 20 + (int)(Math.random() * 50);
		return new UniEmployee(name, age, workplace, position);
	}
	
}
