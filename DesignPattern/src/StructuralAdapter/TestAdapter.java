package StructuralAdapter;

public class TestAdapter {

	
	public static void main(String[] args) {

		creditCard credit=new bankCustomer();
		credit.giveBankdetails();
		System.out.println(credit.getCreditCard());
	}
}
