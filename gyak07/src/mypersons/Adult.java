package mypersons;

public class Adult extends Person{
    private String workspace;

    public Adult(String name, int age, String workspace) {
        super(name, age);
        this.workspace = workspace;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + this.getAge() + ", " + this.workspace;
    }
}
