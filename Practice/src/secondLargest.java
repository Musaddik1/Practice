import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int number;
		int largest=0;
		int largest1=0;
		System.out.println("Enter size of array :");
		number=scanner.nextInt();
		int array[]=new int[number];
		System.out.println("Enter array element  :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		largest=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest=array[i];
			}
		}
		System.out.println("largest element in array :"+largest);
		largest1=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>largest1&&array[i]<largest)
			{
				largest1=array[i];
			}
		}
		System.out.println("second largest element in array :"+largest1);
	}
}
