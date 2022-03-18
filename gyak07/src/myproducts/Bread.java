package myproducts;

public class Bread extends Product {
    private double value;

    public double getValue(){
        return value;
    }

    public Bread(String name, int price, int tax, double value) {
        super(name, price, tax);
        this.value = value;
    }

    @Override
    public String toString(){
        return super.toString() + ", UnitPrice: " + getUnitPrice();
    }

    private double getUnitPrice() {
        return getFullPrice() / value;
    }

    public static boolean compareBreads(Bread a, Bread b){
        return a.getUnitPrice() > b.getUnitPrice();
    }
}
