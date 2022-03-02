package myPackage.first;

public class Number {
    private static final double latitude = 0.001;
    private double number;

    public Number(double number){
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public boolean isCloseTo(double number){
        return Math.abs(number - this.number) < latitude;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
