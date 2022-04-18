package homework;

public class Person {
	public static final String[] Names = new String[]{"Zoli", "Bence", "M�t�", "Marcell", "Noel", "Levente", "�d�m", "Mil�n", "Hanna", "Zo�", "Anna", "Emma", "Mira", "Zs�fi", "L�na", "Luca", "Lili", "Maja", "D�ra", "S�ra", "Lilla", "Csenge", "Lara", "Kincs�"};
	
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + ", " + age;
    }

    public boolean isOlderThan(Person person){
        return this.age < person.age;
    }
}
