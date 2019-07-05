package com.BridgelabzFun;

import java.util.Scanner;
/*
 * @Musaddik Ahemd
 * Program for flip coin
*/public class FlipCoin {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int number,i=1,head=0,tail = 1;
		double random,result_h,result_t;
		System.out.println("Enter number to flip coin :");
		number=scanner.nextInt();
		if(number>0)
		{
			while(i<=number)
			{
				random=Math.random();
				if(random<0.5)
				{
					System.out.println("head");
					head++;
				}
				else
				{
					System.out.println("Tail");
					tail++;
				}
				i++;
			
			}
			result_h=(head*100)/number;
			result_t=(tail*100)/number;
			System.out.println("Percentage of head :"+result_h);
			System.out.println("Percentage of tail :"+result_t);
			
		}
		else
		{
			System.out.println("Please enter number greater than zero :");
		}
		
		
		
	}

}
