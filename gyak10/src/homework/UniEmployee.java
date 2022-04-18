package homework;

public class UniEmployee extends Employee {


	private static int basesalary = 500000;
	private Position position;

	public UniEmployee(String name, int age, String workplace, Position position) {
		super(name, age, workplace, 0);
		this.position = position;
		switch (position) {
		case PROF:
			setSalary(basesalary);
			break;
		case OKTATO:
			setSalary(basesalary * 50 / 100);
			break;
		case ADMIN:
			setSalary(basesalary * 30 / 100);
			break;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + this.basesalary + ", " + this.position;
	}

}