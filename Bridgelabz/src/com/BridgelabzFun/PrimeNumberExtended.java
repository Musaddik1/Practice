package com.BridgelabzFun;

import java.util.Arrays;
import java.util.Scanner;
/*
*/public class PrimeNumberExtended {
	/*
	 * public static void IsAnagram(int i,int number ) { char
	 * str[]=(""+i).toCharArray(); Arrays.sort(str); int temp=Integer.parseInt(new
	 * String(str)) int no=(int) temp; System.out.println(temp); for(int
	 * j=i+1;j<number;j++) { char str1[]=(""+j).toCharArray(); char temp1=str1[j];
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
	
	
	  public static void IsPalindrome(int i)
	  {
		  int temp=i; int rem,rev=0;
	  while(temp!=0)
	  { 
		  rem=temp%10; 
		  rev=rev*10+rem; 
		  temp/=10;
	  } 
	  if(rev==i)
	  {
	  System.out.println("palindrome"); 
	  } else 
	  {
	  System.out.println("not palindrome"); 
	  } 
	  }
	 
	public static void main(String[] args) {
		
		int number,i,j=1,count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		number=scanner.nextInt();
		for(i=10;i<=number;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				
					System.out.println(i);
					PrimeNumberExtended.IsPalindrome(i);
					//PrimeNumberExtended.IsAnagram(i,number);
				
			}
			count=0;
		}
	}

}
