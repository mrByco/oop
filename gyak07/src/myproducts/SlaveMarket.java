package myproducts;

public class SlaveMarket {
    int price;
    String currency;

    SlaveMarket(int price, String currency){
        this.price = price;
        this.currency = currency;
    }

    public Slave BuyMeASlave() {
        return new Slave(price, 0, this);
    }
}
