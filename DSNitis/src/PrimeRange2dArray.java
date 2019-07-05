
public class PrimeRange2dArray {
	static int row=0;
	static int col=0;
	public static void main(String[] args) {
		
			int[][] inputArray=new int[10][30]; 
			int range=1000;
			int tempRange=0;
			while(range<1000)
			{
				
				int s=1;
				for(int i=tempRange;i<=(1000/10)*s;i++)
				{
					int prime=i;
					int c=0;
					for(int j=2;j<=i/2;j++)
					{
						if(i%j==0)
						{
							c++;
						}
						
					}
					if(c==0)
					{
						
							inputArray[row][col]=prime;
						
								col=col+1;
					}
					
				}
				range=tempRange=(1000/10)*s;
				s++;
				row=row+1;
				col=0;
				
				System.out.println();
			}
			System.out.println("Displaying After Storing in 2d Array");
			for(int x=0;x<10;x++)
			{
				for(int z=0;z<30;z++)
				{
					System.out.print(inputArray[x][z]);
				}
				System.out.println();
			}
	}

}
