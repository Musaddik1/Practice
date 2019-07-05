package BridgelabzAlgo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class BinarytoDecimal {
	
	public static int SwapNibbles(int no)
	{
		return ((no&0x0f)<<4|(no&0xf0)>>4);
	}
	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		//int binary,temp;
		int binary[]=new int[8];
		int number,i=0;
		System.out.println("Enter Decimal number :");
		number=scanner.nextInt();
		while(number>0)
		{
			binary[i]=number%2;
			number/=2;
			i++;
		}
		
		  System.out.println("binary number :"); 
		  for(int j=i-1;j>=0;j--) 
		  {
		  System.out.print(binary[j]); 
		  }
		 
		char ch[]=(""+i).toCharArray();
	
		
		String string=new String(ch);
		int no=Integer.parseInt(string);
		no=BinarytoDecimal.SwapNibbles(no);
		System.out.println("Number :"+no);
		
		/*
		 * int temp=binary1; int value=0; int base=1; while(temp!=0) { int last=temp%10;
		 * value=value+base*last; base=base*2; temp/=10; } System.out.println(value);
		 */
	}

}
