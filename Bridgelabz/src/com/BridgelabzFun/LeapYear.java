package com.BridgelabzFun;

import java.util.Scanner;
/*
 * @Musaddik Ahemd
 * Program for lear year or not
 */
public class LeapYear {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int year,temp,count=0;
		System.out.println("Enter year :");
		year=scanner.nextInt();
		temp=year;
		
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		
		if(count==4)
		{
			if(year%4==0&&year%400==0)
			{
				System.out.println("Year is leap year :");
			}
			else if(year%100==0)
			{
				System.out.println("Year is not leap year :");
			}
			else
			{
				System.out.println("Year is not leap year :");
			}
		}
		else
		{
			System.out.println("Please Enter four digits year :");
		}
	}

}
