package com.BridgelabzFun;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter number :");
		number=scanner.nextInt();
		int f1=0,f2=1,f3=0;
		System.out.println(f1);
		System.out.println(f2);
		while(number>=2)
		{
			f3=f2+f1;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			number--;
			
		}

	}

}
