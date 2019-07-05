package com.BridgelabzAlgo;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String string1 = "abc";
		String string2 = "bac";
		Utility utility = new Utility();
		int y=Integer.parseInt(args[0]);
		int p=Integer.parseInt(args[1]);
		int i=Integer.parseInt(args[2]);
		Utility.MonthlyPayment(y, p, i);
		int no=144;
		utility.Sqrt(no);
		
		  
		  int number=scanner.nextInt();
		  utility.Sqrt(number);
		  
		  System.out.println("Enter your Choice :");
		  int choice=scanner.nextInt();
		  utility.TempratureCon(choice);
		  int d=Integer.parseInt(args[0]); 
		  int m=Integer.parseInt(args[1]);
		  int y1=Integer.parseInt(args[2]);
		  utility.DayofWeek(d, m, y1);
		  
		  System.out.println("Enter string  :");
		 string1=scanner.next(); 
		 string1=utility.InsertionString(string1);
		 System.out.println(string1);
		 
		  String binary="1010"; 
		  int no1=Integer.parseInt(binary,2);
		  System.out.println(no1);
		 
		
		 String string="musaddik";
		 utility.InsertionString(string);
		 
		
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("enter array size"); int size=scanner.nextInt(); int
		  array[]=new int [size];
		  array=utility.ScannerIntArray(array); utility.BinaryInt(array);
		 
	}

}
