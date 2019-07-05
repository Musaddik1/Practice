
class Node
{
	int data;
	Node next;
	
}
public class CompanyShareLinkedList {
	Node rear=null;
	Node front=null;
	public void Insert(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(front==null)
		{
			front=node;
			rear=node;
		}
		else
		{
			rear.next=node;
			rear=node;
		}
	}
	public void delete()
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
	
	public static void main(String[] args) {
		CompanyShareLinkedList list=new CompanyShareLinkedList();
		list.Insert(40);
		list.Insert(50);
		list.Insert(60);
		list.delete();
		list.display();
	}
}