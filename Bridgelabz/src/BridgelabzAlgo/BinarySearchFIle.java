package BridgelabzAlgo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Stack;

/*
 * @musaddik ahemd
 * Program for Binary search word using file
 */
public class BinarySearchFIle {
	
	public static void binarySearchWord(String string[],int size)
	{
		
		Scanner scanner=new Scanner(System.in);
		int low=0,high=size-1;int mid;
		System.out.println("Enter String for search :");
		String str=scanner.next();//geting string from user
		mid=(low+high)/2;//calculating mid
		while(low<=high)
		{
			
			if(string[mid].compareTo(str)==0)//comparing two word 
			{
				System.out.println("word found "+string[mid]+" at index  "+(mid));
				break;
			}
			else if(string[mid].compareTo(str)<0)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if(low>high)
		{
			System.out.println("Word not found :");
		}
	}
	//sorting word using bubblesort
	public static String[] bubbleSortword(String string[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(string[i].compareTo(string[j])<0)
				{
					String string2=string[i];
					string[i]=string[j];
					string[j]=string2;
				}
			}
		}
		System.out.println("Sorted String :");
		for(int i=0;i<size;i++)
		{
			System.out.println(string[i]);
		}
		return string;
	

	}
												//marking FileNotFoundExceptin
	public static void main(String[] args) throws FileNotFoundException {
		
		
			File file=new File("first.txt");//creating file object
			Scanner scanner=new Scanner(file);//creating scanner class object passing file object in that
			
			
			int len=(int)file.length();//converting length into integer
			System.out.println(file.length());
		
			String string[] = new String[len];//creating string array
			int i=0;
			while(scanner.hasNext())//checking next word present in file or not
			{
				
				String s=scanner.next();//getting word into string
				string[i]=s;
				i++;
				
			}
			for(int j=0;j<i;j++)
			{
		
				System.out.println(string[j]);
			}
			string=BinarySearchFIle.bubbleSortword(string,i);//sorting word using bubblesortword
			
			BinarySearchFIle.binarySearchWord(string,i);//calling binarysearch method
		
		
		
	}

}
