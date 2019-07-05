import java.util.Scanner;

public class insertionsort<T> {
	
	public static <T extends Comparable<T>>T[] insertion(T[]array)
	{
		int j=0;
		for(int i=1;i<array.length;i++)
		{
			T temp=array[i];
			for( j=i-1;j>=0&&(array[j].compareTo(temp))>0;j--)
			{
				array[j+1]=array[j];
			}
			array[j+1]=temp;
		}
		return array;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of element ");
		int number=scanner.nextInt();
		System.out.println("Enter array element :");
		Character array[]=new Character[number];
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.next().charAt(0);
		}
		array =insertion(array);
		for(Character ch:array)
		{
			System.out.println(ch);
		}
	}
}
