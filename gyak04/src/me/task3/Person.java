package me.task3;

public class Person {
    private String name;
    private int weight;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBWI(){
        return weight / (height * height);
    }

    public String getDescription(){
        return "Név: " + name + " Súly: " + weight + "Magasság: " + height + "tti: " + getBodyType();
    }

    public String getBodyType(){
        if (getBWI() < 18.5) return "sovány";
        else if (getBWI() < 18.5) return "kövér";
        else return "normál";
    }
}
