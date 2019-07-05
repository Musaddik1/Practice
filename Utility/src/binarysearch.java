import java.util.Scanner;

public class binarysearch<T> {

	public static <T extends Comparable<T>>void binary(T[]array,T key)
	{
		int mid=0;
		int low=0;
		
		int high=array.length;
		mid=(low+high)/2;
		while(low<=high)
		{
			if(array[mid].compareTo(key)==0)
			{
				System.out.println("Element found  :"+key);
				break;
			}
			else if(array[mid].compareTo(key)<0)
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
			System.out.println("element not found ");
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of element ");
		int number=scanner.nextInt();
		System.out.println("Enter array element :");
		Integer array[]=new Integer[number];
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter number :");
		int key=scanner.nextInt();
		binary(array,key);
	}
}
