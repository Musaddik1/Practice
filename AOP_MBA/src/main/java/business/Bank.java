package business;

public class Bank {
	
	private String acno="sbi123";
	private int amount=5000;
	
	public int deposite(String acno,int amount)
	{
		
		if(acno.equals(this.acno))
		{
			System.out.println("In deposite mothed..");
			this.amount=this.amount+amount;
			return amount;
		}
		else
		{
			return 0;
		}
	}

}
