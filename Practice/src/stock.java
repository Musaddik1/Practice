


public class stock {
	
	private String Name;
	private int number;
	private double price;
	public stock()
	{
		
	}
	public stock(String name, int number, double price) {
		
		Name = name;
		this.number = number;
		this.price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "stock [Name=" + Name + ", number=" + number + ", price=" + price + "]";
	}
	
	

}
