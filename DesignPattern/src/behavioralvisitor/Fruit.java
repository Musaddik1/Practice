package behavioralvisitor;

public class Fruit implements itemElement{

	private String fname;
	private double price;
	private double weight;
	public Fruit(String fname, double price, double weight) {
	
		this.fname = fname;
		this.price = price;
		this.weight = weight;
	}
	public String getFname() {
		return fname;
	}
	public double getPrice() {
		return price;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public void accept(shoppingCardvisitor visitor) {
		
		visitor.visit(this);
		
	}
	
	
}
