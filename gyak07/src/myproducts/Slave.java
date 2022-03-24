package myproducts;

import mypersons.Person;

public class Slave extends Product {

    private static int LastUsedSlaveId = 0;

    public Person dealer;

    public int purchasePrice;
    public String purchaseCurrency;

    public int id;

    public Slave(int price, int tax, SlaveMarket market) {
        super("Slave", price, tax);
        purchaseCurrency = market.currency;
        purchasePrice = market.price;
        id = ++LastUsedSlaveId;
    }

    @Override
    public String toString(){
        return id + ": " + getFullPrice() + ", Purchased: " + purchasePrice + purchaseCurrency;
    }
}