package StockReport;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import InventoryManagement4.stock;

public class UtilStock 
{
	public Stock getReport(File file) throws IOException
	{
		Scanner scanner=new Scanner(file);
		String name = null;
		int number = 0;
		double price = 0;
		Stock stock1 = null;
		double total_price=0;
		int total_share=0;
	
		while(scanner.hasNext())
		{
			 name=scanner.next();
			 number=scanner.nextInt();
			 price=scanner.nextDouble();
			 stock1=new Stock(name,number,price);
			 System.out.println(stock1);
			 total_price=total_price+stock1.getPrice();
			 total_share=total_share+stock1.getNumber();
					 
			
		}
		System.out.println("Total Price :"+total_price);
		System.out.println("Total Number :"+total_share);
		return stock1;
		
		
		
	
		
	}
}
