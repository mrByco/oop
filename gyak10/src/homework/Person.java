package homework;

public class Person {
	public static final String[] Names = new String[]{"Zoli", "Bence", "Máté", "Marcell", "Noel", "Levente", "Ádám", "Milán", "Hanna", "Zoé", "Anna", "Emma", "Mira", "Zsófi", "Léna", "Luca", "Lili", "Maja", "Dóra", "Sára", "Lilla", "Csenge", "Lara", "Kincsõ"};
	
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
