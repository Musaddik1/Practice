package com.BridgelabzFun;

import java.lang.reflect.Array;
/*
 * @Musaddik Ahemd
 * Program for permutation of String
*/
public class Permutation {
	
	public void Permute(String string,int i,int l)
	{
		if(i==l)
		{
			System.out.println(string);
		}
		else
		{
			for(int j=i;j<=l;j++)
			{
				string=swap(string,i,j);
				Permute(string, i+1, l);//recursive fun
				string=swap(string,i,j);
			}
		}
	}
	private String swap(String string, int i, int j) {
		char str[]=string.toCharArray();
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
			string=new String(str);
			return string;
	}
	public static void main(String[] args) {
		
		String string="abc";
		int len=string.length()-1;//calculating length of string
		Permutation per=new Permutation();
		per.Permute(string, 0, len);
	}

}

