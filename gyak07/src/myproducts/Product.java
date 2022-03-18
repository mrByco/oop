package myproducts;

public class Product {
    protected String name;
    protected int price;
    protected int tax;

    public Product(String name, int price, int tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void increasePrice(int percent){
        this.price += Math.round((float)price * percent / 100);
    }

    public int compare(Product product){
        return Integer.compare(this.price, product.price);
    }


    public int getFullPrice(){
        return Math.round(price + (float)price * tax / 100);
    }

    @Override
    public String toString(){
        return name + ": " + getFullPrice() + "Ft";
    }
}
