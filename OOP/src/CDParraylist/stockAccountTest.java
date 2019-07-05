package CDParraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import CDP.Utility;
import CDParraylist.*;

public class stockAccountTest {
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Utility uti=new Utility();
	
		ArrayList<CompanyShare> listshare = new ArrayList<CompanyShare>();
		int number;
		System.out.println("How many data do you want to insert ?:");
		number = uti.inputInteger();
		Iterator<CompanyShare> listite = listshare.iterator();
		CompanyShare share = new CompanyShare();
		StockAccount stock=new StockAccount(share);
		char ch;
		while (number >= 1) {
			share = new CompanyShare();
			System.out.println("Enter symbol :");
			String symbol = uti.inputString();
			share.setName(symbol);
			System.out.println("Enter number of share :");
			int numberofshare = uti.inputInteger();
			share.setShare(number);
			System.out.println("Enter price :");
			double price = uti.inputDouble();
			share.setPrice(price);
			System.out.println("Enter Date  :");
			String date = uti.inputString();
			share.setDate(date);
			listshare.add(share);
			
			share = new CompanyShare();
			number--;
		}
		
		do {

			System.out.println("**********Stock Report************");
			System.out.println("\n1.Sell\n2.Buy");
			System.out.println("\nEnter your choice :");
			int choice = uti.inputInteger();
			switch (choice) {
			case 1:
				System.out.println("Which company share to do want to sell :");
				String symbol = uti.inputString();
				listshare = stock.sell(listshare, symbol);
				listite = listshare.iterator();
				for(int i=0;i<listshare.size();i++)
				{
					String symbol1=listshare.get(i).getName();
					if(symbol1.compareTo(symbol)==0)
					{
						if(listshare.get(i).getName().equals(symbol1))
						System.out.println(listshare.get(i).toString());
					}
				}
		
				break;
			case 2:
				System.out.println("Which company share to do want to buy :");
				symbol = uti.inputString();
				listshare = stock.buy(listshare, symbol);
				listite = listshare.iterator();

				while (listite.hasNext())
				{
					share = listite.next();
					if (share.getName().equals(symbol))
						System.out.println(listite.next());
				}
				break;

			}
			System.out.println("Do you want to continue :[y/n]");
			ch = scanner.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}

}
