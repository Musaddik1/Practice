package com.BridgelabzFun;

import java.util.Scanner;
/*
 *@Musaddik Ahmed
 *Program for Gambler
*/public class Gambler {
	
	public static void main(String[] args) {
		
		int stake,goal,number,bet=500,i=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Stake :");
		stake=scanner.nextInt();
		System.out.println("Enter goal :");
		goal=scanner.nextInt();
		System.out.println("Enter number :");
		number=scanner.nextInt();
		while(i<=number)
		{
			double random=Math.random();
		
			if(random<0.5)
			{
				
				stake=stake+bet;
				System.out.println("Win");
				
				
			}
			else
			{
				stake=stake-bet;
				System.out.println("Loss");
			}
			
			
			i++;
		}
		if(stake>=goal)
		{
			System.out.println("You completed target :"+stake);
			
		}
		else if(stake>0 &&stake<goal)
		{
			System.out.println("You didnt complete goal"+stake);
		}
		
	}

}
