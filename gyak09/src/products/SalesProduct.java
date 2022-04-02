package products;

import java.awt.Color;

public interface SalesProduct {

	int defaultPrice = 100;
	
	String getCurrency();
	void setCurrency(String currency);

	int getPrice();
	void setPrice(int price);
}
