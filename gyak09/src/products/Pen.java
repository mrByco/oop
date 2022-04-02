package products;

import java.awt.Color;
import coloring.Colorable;

public class Pen extends Product implements Colorable{
	
	Color penColor;
	String brandName;
	
	public Pen(String brandName, Color penColor, int price)
	{
		super("pen", price, 27);
		this.brandName=brandName;
		this.penColor=penColor;
	}
	
	@Override
	public String toString()
	{
		return "Product name: "+penColor+" "+getName()+"\nBrand: "+brandName+"\nPrice: "+grossPrice()+"\nVat: "+getVat()+"\n";
	}
	
	public Color getColor()
	{
		return penColor;
	}
	
	public void setColor(Color givenColor)
	{
		this.penColor=givenColor;
	}

}