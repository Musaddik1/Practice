package com.BridgelabzFun;

import java.util.Scanner;

/*
 * @Musaddik Ahmed
 * Program for Quadradic equation
*/public class Quadradic {
	
	public static void main(String[] args) {
		
		int a,b,c;
		double delta;
		double root1 = 0,root2 = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of a,b and c :");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		delta=(b*b-4*a*c);
		System.out.println(delta);
		if(delta>0)
		{
			root1=(-b+(Math.sqrt(delta))/2*a);
			root2=(-b-(Math.sqrt(delta))/2*a);
		}
		 System.out.println("root1 of x is :"+root1);
		 System.out.println("root2 of x is :"+root2);
	}

}
