package com.BridgelabzFun;

import java.util.Scanner;
/*
 * @Musaddik Ahmed
 * Program for Stop watch
*/public class StopWatch {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		long start;
		long stop;
		int fno,sno;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number to start :");
		fno=scanner.nextInt();
		start=System.currentTimeMillis();
		System.out.println("Enter any number to End :");
		sno=scanner.nextInt();
		stop=System.currentTimeMillis();
		long l=stop-start;
		long temp=l;
		int i=1;
		StringBuffer sb=new StringBuffer();
		while(i<=temp)
		{
		System.out.println(i);
		Thread.sleep(10);
		i++;
		}
		int second=(int) (l/1000);
		System.out.println(second+"sec");
		
		
	}

}
