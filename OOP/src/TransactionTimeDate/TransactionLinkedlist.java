package TransactionTimeDate;

class Node<T>
{
	Object data;
	Node next;
}
public class TransactionLinkedlist<T> {
	Node front=null;
	Node rear=null;
	
	public void Insert(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(front==null)
		{
			rear=node;
			front=node;
			
		}
		else
		{
			rear.next=node;
			rear=node;
		}
		
	}
	public void Delete()
	{
		if(front==null && rear==null)
		{
			System.out.println("Underflow");
		}
		else
		{
			Node node=front;
			front=front.next;
		}
	}
	public void display()
	{
		Node node=front;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
	public static void main(String[] args) {
		
		
		TransactionLinkedlist<String> list=new TransactionLinkedlist<String>();
		list.Insert("ABC");
		list.Insert("DEC");
		list.Insert("ZERO");
		list.Delete();
		list.display();
	}
}
