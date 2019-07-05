package CDParraylist;
import CDP.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import CompanyShareLinkedlist.companyShareLinkelist;

public class StockAccount
{

	Utility uti=new Utility();
	static Scanner scanner=new Scanner(System.in);
	CompanyShare share;
	private int amount;
	String string;
	int number = 0;
	double price;
	public StockAccount()
	{
		
	}
	public StockAccount(CompanyShare share)
	{
		this.share=share;
		
	}
	public boolean CheckShare() 
	{
		if(share.getShare()!=0&&share.getName()!=null||share.getShare()!=0)
			
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public double ValueOf()
	{
		return 0;
	}
	public ArrayList<CompanyShare> buy(ArrayList<CompanyShare> list,String symbol) 
	{
		
		Iterator<CompanyShare> listiterator=list.iterator();
		while(listiterator.hasNext())
		{
			CompanyShare companyShare=listiterator.next();

			if(companyShare.getName().equals(symbol))
			{
			System.out.println("Enter price of share :");
			double price=uti.inputDouble();
			price=(companyShare.getPrice()-price);
			companyShare.setPrice(price);
			System.out.println("Enter number of share  :");
			int share=uti.inputInteger();
			int share1=(companyShare.getShare()+share);
			companyShare.setShare(share1);
			list.add(companyShare);
			return list;
			}
			else
			{
				return list;
			}
		}
		return list;
		
	

		
	}
	public ArrayList<CompanyShare> sell(ArrayList<CompanyShare> listshare,String symbol) 
	{
		
		Iterator<CompanyShare> listiterator=listshare.iterator();
		while(listiterator.hasNext())
		{
			CompanyShare companyShare=listiterator.next();

			if(companyShare.getName().equals(symbol))
			{
			System.out.println("Enter price of share :");
			double price=uti.inputDouble();
			price=(companyShare.getPrice()+price);
			companyShare.setPrice(price);
			System.out.println("Enter number of share  :");
			int share=uti.inputInteger();
			int share1=(companyShare.getShare())-share;
			companyShare.setShare(share1);
			listshare.add(companyShare);
			return listshare;
			}
			else
			{
				return listshare;
			}
		}
		return listshare;
		
	

		
	}
	public void save(File filename) 
	{
		
		
	}
	public void printReport(CompanyShare share[])
	{
		System.out.println(share[0]);
	}



}
