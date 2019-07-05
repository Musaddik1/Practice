package com.BridgelabzFun;

import java.util.Scanner;
/*
 * @Musaddik Ahmed
 * Program of sum of array element equal to zero
*/
public class SumofArray
{
	
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter number of element in array :");
		number=scanner.nextInt();
		int array[]=new int[number];
		System.out.println("Enter array elements :");
		//getting element from user
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		//printing array element
		System.out.println("Array element  :");
		for(int var :array)
		{
			System.out.println(var);
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					//checking sum of three element
					if(array[i]+array[j]+array[k]==0)
					{
						System.out.println("["+array[i]+" "+array[j]+" "+array[k]+"]");
					
					}
				}
			}
		}
	}

}
