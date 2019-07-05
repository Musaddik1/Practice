import java.util.Scanner;

public class BubbleSort<T>  {

	Object object[]=new Object[10];
	static Scanner scanner=new Scanner(System.in);
	
	public static <T extends Comparable<T>>T[] BubbleSort(T array[],int n)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i].compareTo(array[j])<=0)
				{
					T temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public void display(T array[],int n)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
	
		BubbleSort<Integer> sort=new BubbleSort<Integer>();
		System.out.println("enter number of element :");
		int number=scanner.nextInt();
		Integer array[]=new Integer[number];
		System.out.println("Enter array element :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		array=sort.BubbleSort(array, number);
		sort.display(array, number);
	}
	
}
