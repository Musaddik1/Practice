package BridgelabzAlgo;

import java.util.Scanner;

/*
 * @Musaddik Ahmed
 * Program for Vending Machine
*/
public class VendingMachine {
	static int note1=0,note2=0,note5=0,note10=0,note50=0,note100=0;
	static int note500=0,note1000=0;//declaring variables for notes
	static int result=0;
	public static void Note(int Rs)
	{
		
		if(Rs!=0)//checking rupees is not equal to 0
		{
			if(Rs>=1000)//if loop for rupees greater than and equal to 1000
			{
				note1000++;
				Rs=Rs-1000;
				
				result+=1000;
			}
			else if(Rs<1000&&Rs>=500)
			{
				note500++;
				Rs=Rs-500;
				result+=500;
			}
			else if(Rs<500&&Rs>=100)
			{
				note100++;
				Rs=Rs-100;
				result+=100;
			}
			else if(Rs<100&&Rs>=50)
			{
				note50++;
				Rs=Rs-50;
				result+=50;
				
			}
			else if(Rs<50&&Rs>=10)
			{
				note10++;
				Rs=Rs-10;
				result+=10;
				
			}
			else if(Rs<10&&Rs>=5)
			{
				note5++;
				Rs=Rs-5;
				result+=5;
			}
			else if(Rs<5&&Rs>=2)
			{
				note2++;
				Rs=Rs-2;
				result+=2;
			}
			else if(Rs<2&&Rs>=1)
			{
				note1++;
				Rs=Rs-1;
				result+=1;
			}
			VendingMachine.Note(Rs);
		}
		else
		{
		//printing number of notes and total amount
		
		System.out.println("1000 note :"+note1000);
		System.out.println("500 note :"+note500);
		System.out.println("100 note :"+note100);
		System.out.println("50 note :"+note50);
		System.out.println("10 note :"+note10);
		System.out.println("5 note :"+note5);
		System.out.println("2 note :"+note2);
		System.out.println("1 note :"+note1);
		System.out.println("Total Amount :"+result);
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rupees :");//getting rupees from user
		int Rs=scanner.nextInt();
		VendingMachine.Note(Rs);
		
	}

}
