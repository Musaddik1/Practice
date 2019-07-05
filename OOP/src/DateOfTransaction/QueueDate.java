package DateOfTransaction;

class Node<T>
{
	Object data;
	Node next;
}
public class QueueDate<T> {
	Node rear=null;
	Node front=null;
	public void Enqueue(T data)
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
	public void Dequeue()
	{
		Node node=front;
		
		front=front.next;
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
	

}
