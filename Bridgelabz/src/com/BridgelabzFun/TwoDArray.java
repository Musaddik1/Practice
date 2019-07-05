
package com.BridgelabzFun;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
// Class for 2-D array
/* 
 * @Musaddik Ahmed
 * Program for printing 2-D array
 */
public class TwoDArray {
	
	Scanner scanner=new Scanner(System.in);
	PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
	//method for getting element of int 2-D array
	public void IntegerArray(int[][] array, int row, int column)
	{
		System.out.println("Insert integer array element :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextInt();
			}
		}
	}
	//method for getting element of double 2-D array
	public void DoubleArray(double array[][],int row, int column)
	{
		System.out.println("Insert double array Elements :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextDouble();
			}
		}
	}
	//method for getting element of boolean 2-D array
	public void booleanArray(boolean array[][],int row, int column)
	{
		System.out.println("Insert boolean array elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=scanner.nextBoolean();
			}
		}
	}
	//method for displaying element of Integer 2-D array
	public void display(int array[][],int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.print(array[i][j]+" ");
			}
			pw.print("\n");
		}
		
	}
	//method for displaying element of double 2-D array
	public void display(double array[][],int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.print(array[i][j]+" ");
			}
			pw.print("\n");
		}
		
	}
	//method for displaying element of Integer 2-D array
	public void display(boolean array[][],int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.print(array[i][j]+" ");
			}
			pw.print("\n");
		}
				
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int row,column;
		TwoDArray twodarray=new TwoDArray();
		System.out.println("Enter number of rows :");
		row=scanner.nextInt();
		System.out.println("Enter number of column :");
		column=scanner.nextInt();
		
		int arrayint[][]=new int[row][column];
		double arraydouble[][]=new double[row][column];
		boolean arrayboolean[][]=new boolean[row][column];
		twodarray.IntegerArray(arrayint,row,column);
		
		twodarray.DoubleArray(arraydouble, row, column);
		
		twodarray.booleanArray(arrayboolean, row, column);
		twodarray.display(arrayint, row, column);
		twodarray.display(arraydouble, row, column);
		twodarray.display(arrayboolean, row, column);
		
		
	}

}
