package products;

public class Product {

	private String name;
	private int nettoPrice;
	private int vat;
	
	public Product(String name, int nettoPrice, int vat) {
		this.name = name;
		this.nettoPrice = nettoPrice;
		this.vat = vat;
	}
	
	public int compareGrossPrice(Product newPrice)
	{
		if(newPrice.grossPrice()<this.grossPrice())
		{
			return 1;
		}
		else if(newPrice.grossPrice()>this.grossPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	public void increasePrice(int percent)
	{
		nettoPrice+=Math.round((float)nettoPrice*(percent/100));
	}
	
	public int grossPrice()
	{
		return nettoPrice+=Math.round((float)nettoPrice*(vat/100));
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+"\nNetto price: "+nettoPrice+"\nVat: "+vat+"\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNettoPrice() {
		return nettoPrice;
	}

	public void setNettoPrice(int nettoPrice) {
		this.nettoPrice = nettoPrice;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}
	
}