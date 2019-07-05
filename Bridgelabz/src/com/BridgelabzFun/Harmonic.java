package com.BridgelabzFun;

import java.util.Scanner;
/*
 * @Musaddik Ahemd
 * Program for Harmonic Series
*/
public class Harmonic {
	
	public static void main(String[] args) {
		
		int number;
		float sum=0.f;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		number=scanner.nextInt();
		if(number!=0)
		{
			for(int i=1;i<=number;i++)
			{
				sum=sum+1/(float)i;//typecasting i into float
				
				
			}
			System.out.println(sum);
		}
		else
		{
			System.out.println("Please Enter number greater than zero :");
		}
		
	}

}
