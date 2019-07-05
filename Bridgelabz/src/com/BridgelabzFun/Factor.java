package com.BridgelabzFun;

import java.util.Scanner;
/*
 * @Musaddik Ahemd
 * Program for Factorization of number 
*/public class Factor {
	
	public static void main(String[] args) {
		
		int number,i,j=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		number=scanner.nextInt();
		for(i=2;i<=number;i++)
		{
			while(number%i==0)
			{
				System.out.println(i);
				number=number/i;
			}
			
		}
	}

}
