
package com.BridgelabzFun;

import java.util.Scanner;
import java.util.stream.Stream;
/*
 *@Musaddik Ahemd
 *Program for Coupon number
*/public class CouponNumber {
	
	public static void main(String[] args) {
		
		int number,i=1,count=0;
		//converting string to char array
		char str[]="abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		number=scanner.nextInt();//getting number from user
		int max=100000;
		StringBuffer sb=new StringBuffer();
		while(i<=number)
		{
			
			int random=(int) (Math.random()*max);
			while(random>0)
			{
				sb.append(str[(random%str.length)]);//concating element in sb object
				count++;//counting random number
				random=random/str.length;
				
			}
			String string=sb.toString();
			sb=new StringBuffer();
			System.out.println(string);
			string=null;
			i++;

		}
		System.out.println("count :"+count);
		
		
	}

}
