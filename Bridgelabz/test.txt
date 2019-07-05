package com.BridgelabzFun;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter number :");
		 number=scanner.nextInt();
		 int count=0;
		for(int i=2;i<=number;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
				
			}
			count=0;
		}
	}
}
