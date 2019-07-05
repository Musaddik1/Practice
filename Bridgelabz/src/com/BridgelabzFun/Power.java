package com.BridgelabzFun;
/*
 * @Musaddik Ahmed
 * Program for Power of 2
*/public class Power {
	
	public static void main(String[] args) {
		
		int number=Integer.parseInt(args[0]);
		int i;
		int power=1;
		if(number>0&&number<31)
		{
			for(i=1;i<=number;i++)
			{
			//System.out.println("2^"+i+"  "+(int)Math.pow(2, i));
				power=power*2;
				System.out.println("2^"+i+"  "+power);
			}
		}
		else
		{
			System.out.println("Int overflow ");
		}
		
		
	}

}
