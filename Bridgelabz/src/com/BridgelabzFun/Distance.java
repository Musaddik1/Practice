package com.BridgelabzFun;

/*
 * @Musaddik Ahmed
 * Program for calculating distance
*/public class Distance {
	
	public static void main(String[] args) {
		
		int x=Integer.parseInt(args[0]);//converting string to integer
		int y=Integer.parseInt(args[1]);
		double distance=Math.sqrt((x*x+y*y));//formula
		
		System.out.println("Distance is :"+distance);
	}

}
