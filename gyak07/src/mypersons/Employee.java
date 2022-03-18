package mypersons;

public class Employee extends Adult {
    static int retireAge = 65;
    private int salary;

    public Employee(String name, int age, String workspace, int salary) {
        super(name, age, workspace);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + getSalary();
    }
}
