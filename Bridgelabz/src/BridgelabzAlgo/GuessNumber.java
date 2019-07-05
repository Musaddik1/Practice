package BridgelabzAlgo;

import java.util.Scanner;

public class GuessNumber {
	static Scanner scanner=new Scanner(System.in);
	public static void Number(int first,int last)
	{
		int mid=(first+last)/2;
		char choice;
		System.out.println(mid+"Is this is your number [y/n]");
		 choice=scanner.next().charAt(0);
		 
		while(first<last)
		{
			
			
			if(choice=='Y'||choice=='y')
			{
				System.out.println("your number found ");
				 break;
			}
			else
			{
				System.out.println("ok let's take a another chance \nIs your number between "+first+" and "+mid+" [y/n]");
				choice=scanner.next().charAt(0);
				if(choice=='Y'||choice=='y')
				{
					last=mid-1;
					Number(first, last);
				}
				else
				{
					first=mid+1;
					Number(first, last);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		int first=Integer.parseInt(args[0]);
		int last=Integer.parseInt(args[1]);
		/*
		 * System.out.println("Enter first number :"); int first=scanner.nextInt();
		 * System.out.println("Enter last number :"); int last=scanner.nextInt();
		 */
		GuessNumber.Number(first, last);
		
	}

}
