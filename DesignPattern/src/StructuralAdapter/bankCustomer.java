package StructuralAdapter;

import java.util.Scanner;

public class bankCustomer extends BankDetails implements creditCard {

	
	public void giveBankdetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter holder name :");
		String name=scanner.next();
		System.out.println("Enter bank name :");
		String bname=scanner.next();
		System.out.println("Enter account no :");
		long acount=scanner.nextLong();
		setHoldername(name);
		setBankname(bname);
		setAccountno(acount);
		
		
	}

	@Override
	public String getCreditCard() 
	{
	String name=getHoldername();
	String bname=getBankname();
	long account=getAccountno();
	
	return ("Name  :"+name+" \nbank name   :"+bname+"\nAccount no :  "+account+"");
	}

	
	

}
