import java.util.Scanner;

public class SimpleParenthesis {
	
	static Node top;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Expression:");
		
		String str="(5+6)*(7+8)/(5+6)*(45+(89)+89)";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='(')
				insert(str.charAt(i));
			else if(str.charAt(i)==')')
				 pop();
			  	
			
			
		}
		System.out.println("After Inserting in Stack:");
		show();
		
	}
	
	public static <T>void insert(T c)
	{
		Node newNode=new Node();
		
	
		if(top==null)
		{
			newNode.data=c;
			newNode.next=null;
			top=newNode;
		}
		else
		{
			newNode.data=c;
			newNode.next=top;
			top=newNode;
		}
		
	}
	
	public static void show()
	{
		
		Node current=top;
		if(top==null)
		{
			System.out.println("Is Balnaced:");
			
		}
		else {
			while(current.next!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println("Not Balanced:");
		}
	}
	
	public static void pop()
	{
		
		if(top.data.equals('('))
		{
			top=top.next;
		}
	}

}
