package homework;

public class Employee extends Person {
	private String workspace;
    private int salary;

    public Employee(String name, int age, String workspace, int salary) {
        super(name, age);
        this.setWorkspace(workspace);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int value) {
        this.salary = value;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + getSalary() + ", " + this.getWorkspace();
    }

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}
}
