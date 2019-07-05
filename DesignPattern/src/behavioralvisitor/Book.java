package behavioralvisitor;

public class Book  implements itemElement{

	private String bname;
	private int  number;
	
	public Book(String bname,int number)
	{
		this.bname=bname;
		this.number=number;
	}

	public String getBname() {
		return bname;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public void accept(shoppingCardvisitor visitor)
	{
		
		visitor.visit(this);
	}
	
}
