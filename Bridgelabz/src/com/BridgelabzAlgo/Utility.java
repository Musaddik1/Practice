package com.BridgelabzAlgo;

import java.util.Scanner;

public class Utility {
	static Scanner scanner=new Scanner(System.in);
	static int size;

	/*
	 * program for Binary search for int
	*/	
	public static void BinaryInt(int array[])
	{
		
		
		int low=0,high=array.length-1,mid;
		Utility utility=new Utility();
		//Sorting element
		utility.BubbleInt(array);
		for(int var : array)
		{
			System.out.println(var);
		}
		//getting key to search
		System.out.println("Enter number for searching :");
		int key=scanner.nextInt();
		mid=(low+high)/2;
		
		while(low<=high)
		{
			if(key==array[mid])
			{
				System.out.println("nubmer found"+array[mid]);
				break;
			}
			else if(array[mid]<key)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;;
			}
			mid=(low+high)/2;
		}
		if(low>high)
			System.out.println("element not found...");
		
		
		
	}
	/*
	 * program for binary Searching for String
	*/	public static void binaryString(String string)
	{
		int low=0,high=string.length()-1,mid;
		
		Utility utility=new Utility();
		//Sorting element in ascending order using bubblesort
		string=utility.BubbleString(string);
		char string1[]=string.toCharArray();	
		System.out.println("Enter character for searching :");
		char key=scanner.next().charAt(0);
		mid=(low+high)/2;
		
		while(low<=high)
		{
			if(key==string1[mid])
			{
				System.out.println("Character found:  "+string1[mid]);
				break;
			}
			else if(string1[mid]<key)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;;
			}
			mid=(low+high)/2;
		}
		if(low>high)
			System.out.println("element not found...");
		
	
	}
	/*
	 * Program for bubbleSort String
	*/	public static String BubbleString(String string)
	{
		char string1[]=string.toCharArray();
		//sorting element
		for(int i=0;i<string1.length;i++)
		{
			for(int j=0;j<string1.length;j++)
			{
				if(string1[i]<string1[j])
				{
					char temp=string1[i];
					string1[i]=string1[j];
					string1[j]=temp;
				}
			}
		}
		
		string=new String(string1);
		return string;
		
	}
	/*
	 * Program for BubbleSort integer
	*/	public static void BubbleInt(int array[])
	{
		
		//sorting element using swapping
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int var : array)
		{
			System.out.println(var);
		}
	}

	/*
	 * program for InsertionSort
	*/	public static int[] InsertionInt(int array[])
	{
		int j;
		for(int i=1;i<array.length;i++)
		{
			int key=array[i];
			for( j=i-1;j>=0&&array[j]>key;j--)
			{
				array[j+1]=array[j];
			}
			array[j+1]=key;
		}
		return array;
	}

	/*
	 * Program for InsertionSort String
	*/	public static  String InsertionString(String string )
	{
		int j;
		char string1[]=string.toCharArray();
		for(int i=1;i<string1.length;i++)
		{
			char key=string1[i];
			for( j=i-1;j>=0&&string1[j]>key;j--)
			{
				string1[j+1]=string1[j];
			}
			string1[j+1]=key;
		}
		
		
		string=new String(string1);
		return string;
	}

	/*
	 * Scanning array element for user
	*/	public static int[] ScannerIntArray(int array[])
	{
		System.out.println("Enter array element  :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		return array;
	}

	/*
	 * Printing Array element
	*/	public static void printIntArray(int array[])
	{
		for(int var:array)
		{
			System.out.println(var);
		}
	}
	
	/*
	 * Program for to print calendar
	*/	public static void DayofWeek(int d,int m,int y)
	{
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int mo=m+12*((14-m)/12)-2;
		int d0=(d+x+31*mo/12)%7;
		System.out.print("day :");
		//using switch for Days
		switch(d0)
		{
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
		case 5:
			System.out.print("Friday");
		case 6:
			System.out.print("Saturday");
			break;
			
			
		}
		System.out.println("\n");
		System.out.print("Month :");
		switch(m)
		{
		case 1:
			System.out.print("Jan");
			break;
		case 2:
			System.out.print("Feb");
			break;
		case 3:
			System.out.print("Mar");
			break;
		case 4:
			System.out.print("Apr");
			break;
		case 5:
			System.out.print("May");
			break;
		case 6:
			System.out.print("Jun");
			break;
		case 7:
			System.out.print("Jul");
			break;
		case 8:
			System.out.print("Aug");
			break;
		case 9:
			System.out.print("Sep");
			break;
		case 10:
			System.out.print("Oct");
			break;
		case 11:
			System.out.print("Nov");
		case 12:
			System.out.print("Dec");
			break;
			
		
		}
		System.out.println("\n");
		System.out.println("year "+y0);
	}

	/*
	 * Program for Anagram string or not
	*/	public static void IsAnagram(String string1,String string2)
	{
		char array1[]=string1.toCharArray();//converting string to char array
		char array2[]=string2.toCharArray();
		if(array1.length==array2.length)
		{
			for(int i=0;i<array1.length;i++)//sorting element of first array 
			{
				for(int j=0;j<array1.length;j++)
				{
					if(array1[i]<array1[j])
					{
						char temp=array1[i];
						array1[i]=array1[j];
						array1[j]=temp;
						
					}
				}
			}
			
			for(int i=0;i<array2.length;i++)//soritng element of second array
			{
				for(int j=0;j<array2.length;j++)
				{
					if(array2[i]<array2[j])
					{
						char temp=array2[i];
						array2[i]=array2[j];
						array2[j]=temp;
					}
				}
			}
		}
		else
		{
			System.out.println("Length is not same  :");
		}
		string1=new String(array1);//converting char array to string
		string2=new String(array2);
		if(string1.equals(string2))//checking contain of two string 
		{
			System.out.println("Strings are anagram :");
		}
		else
		{
			System.out.println("String are not anagram :");
		}
	}

	/*
	 * Program for convert temprature int Celcius and Fahrenheit
	*/	public static void TempratureCon(int choice)
		{
		
			float temperature,celsius,fahrenheit;
			Scanner scanner = new Scanner(System.in);
			switch(choice)//getting choice from user
			{
			case 1:
				System.out.println("Enter the Fahrenheit Temperature:");
				temperature=scanner.nextFloat();
				celsius=(temperature-32)*5/9;
				System.out.println("Temperature in Celsius: "+celsius+"C");
				break;
			case 2:	
				System.out.println("Enter the Celsius Temperature:");
				temperature=scanner.nextFloat();
				fahrenheit=(temperature*9/5)+32;
				System.out.println("Temperature in Fahrenheit: "+fahrenheit+"F");
				break;
			default:
				    System.out.println("you Entered Wrong choice..!!");
					break;
			}
	}

	/*
	 * Program to find square root of number
	*/	public static void Sqrt(int number )
	{
		double t=number;
		double epsilon=1e-15;
		double no=Math.abs(t-number/t);
		System.out.println("no"+no);
		while(Math.abs(t-number/t)>epsilon*t)
		{
			t=(number/t+t)/2;
		}
		System.out.println("Square root of number is :"+t);
	}

	/*
	 * Program for Monthly Payment
	*/	public static void MonthlyPayment(int year,int principal,int interest)
	{
		double n=12*year;
		double r=interest/(12*100);
		double payment=principal*r/1-(Math.pow(1+r, -n));
		System.out.println("Payment :"+payment);
	}

	/*
	 * Program for to binary
	*/	public static void ToBinary(int number)
	{
		int binary[]=new int[8];
		int i=0;
		while(number>0)
		{
			binary[i]=number%2;//taking binary number into array
			number/=2;
			i++;
		}
		System.out.println("binary number :");
		for(int j=i-1;j>=0;j--)//printing binary number in reverse order
		{
			System.out.print(binary[j]);
		}
		int no=toNibble(binary);
		i=0;
		System.out.println("number :"+no);
		while(no>0)
		{
			binary[i]=no%2;
			no/=2;
			i++;
		}
	
		System.out.println("binary number :");
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}

	}
	public static int  toNibble(int array[])
	{
		int i;
		for( i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		char ch[]=(""+i).toCharArray();
		
	
		
		String string=new String(ch);
		
		int no=Integer.parseInt(string);
		return no;
	}
	
}
