package com.BridgelabzFun;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
		String string=scanner.next();
		if(string.length()<=3)
		{
			string=string.replace(string, "Musaddik");
		}
		System.out.println(string);
			
		
	}

}