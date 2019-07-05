package BridgelabzAlgo;
/*
 * @Musaddik Ahmed
 * Program for bubbleSortWord 
*/
public class BubbleSortWord {
	
	public String[] bubbleSortword(String string[])
	{
		for(int i=0;i<string.length;i++)//sorting element
		{
			for(int j=0;j<string.length;j++)
			{
				if(string[i].compareTo(string[j])<0)//
				{
					String string2=string[i];
					string[i]=string[j];
					string[j]=string2;
				}
			}
		}
		System.out.println("Sorted String :");
		for(int i=0;i<string.length;i++)
		{
			System.out.println(string[i]);
		}
		return string;

	}
	public static void main(String[] args) {
		
		String string[]= {"musaddik","ahmed","shaikh","ishaque"};//declaring static string array
		BubbleSortWord word=new BubbleSortWord();// creating bubblesortword class object
		word.bubbleSortword(string);
				
		
	}

}
