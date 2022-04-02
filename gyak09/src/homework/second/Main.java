package homework.second;

import products.Book;
import products.Estate;
import products.Product;
import products.SalesProduct;

public class Main {
	
	private static final int FORINT_TO_EURO = 255;

	public static void main(String[] args) {
		SalesProduct estate = new Estate(400000, 255, "Kevin villa");
		System.out.println(estate);
		ConvertEuroForint(estate);
		System.out.println(estate);
		ConvertEuroForint(estate);
		
		SalesProduct book = new Book("Harry Potter", 255, 20);
		System.out.println(book);
		ConvertEuroForint(book);
		System.out.println(book);

		
	}
	
	public static void ConvertEuroForint(SalesProduct product) {
		if (product.getCurrency().equalsIgnoreCase("Ft")) {
			product.setPrice(product.getPrice() / FORINT_TO_EURO);
			product.setCurrency("Euro");
		}
		else if (product.getCurrency().equalsIgnoreCase("Euro")) {
			product.setPrice(product.getPrice() * FORINT_TO_EURO);
			product.setCurrency("Ft");
		}
	}
	
}
