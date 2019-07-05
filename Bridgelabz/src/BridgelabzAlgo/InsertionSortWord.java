package BridgelabzAlgo;

/*
 *@Musaddik Ahmed
 *Program for Insertion sort word 
*/
public class InsertionSortWord 
{
	
	public static void main(String[] args) {
		int j;
		String string[]= {"musaddik","ahmed","shaikh","ishaque"};
		for(int i=1;i<string.length;i++)
		{
			String str=string[i];
			for( j=i-1;j>=0&&(string[j].compareTo(str)>0);j--)
			{
				
				{
					string[j+1]=string[j];
				}
				
			}
			string[j+1]=str;
		}
		System.out.println("Sorted String :");
		for(int i=0;i<string.length;i++)
		{
			System.out.println(string[i]);
		}
	}

}
