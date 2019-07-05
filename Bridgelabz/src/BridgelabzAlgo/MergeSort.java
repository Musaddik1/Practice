package BridgelabzAlgo;

import java.util.Scanner;

public class MergeSort
{
	public int []tempmerge;
	public int []array;
	public int length;
	
	public static void main(String []args)
	{
		int []inputArray= {48,36,13,52,19,94,21};
		MergeSort ms=new MergeSort();
		ms.sort(inputArray);
		ms.divideArray(0,inputArray.length-1);
	}

	private  void divideArray(int l, int h)
	{
		
		if(l<h)		
		{
			int mid=(l+h)/2;
			divideArray(l, mid);
			divideArray(mid+1,h);
			array=merge(l,mid,h);
		}
		
		for(int var:array)
		{
			System.out.println(var);
		}
	}

	public  int[] merge(int l, int mid, int h) {
		int i,j,k;
		for( i=l;i<h;i++)
		{
			tempmerge[i]=array[i];
		}
		i=l;
		j=mid+1;
		k=l;
		while(i<mid&&j<=h)
		{
			if(tempmerge[i]<=tempmerge[j])
			{
				array[k]=tempmerge[i];
				i++;
				
			}
			else
			{
				array[k]=tempmerge[j];
				j++;
			}
			k++;
		}
		while(i<=mid)
		{
			array[k]=tempmerge[i];
			k++;
			i++;
		}
		while(j<=h)
		{
			array[k]=tempmerge[j];
			k++;
			j++;
		}
		return array;
		
	}

	public void sort(int[] inputArray) {
		// TODO Auto-generated method stub
		array=inputArray;
		length=inputArray.length;
		tempmerge=new int[length];
	}
}
