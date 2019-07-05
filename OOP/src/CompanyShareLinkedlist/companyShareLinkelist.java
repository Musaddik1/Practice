package CompanyShareLinkedlist;

class Node<T>
{
	Object data;
	Node next;
}
public class companyShareLinkelist<T> {
	Node head=null;
	public void Insert(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
		
	}
	
	public void Delete()
	{
		Node node=head;
		head=head.next;
	}
	public void display()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
	
	
}

/*
 * public void Delete_Back() { 
 * Node ptr,prev = null;
 *  if(head==null)
 *  {
 *   Node temp=head; head=null;
 *    }
 *     else 
 *    { 
 *    ptr=head; 
 *    while(ptr.next!=null)
 *     { 
 * 	prev=ptr;
 * 	ptr=ptr.next;
 *  }
 *   prev.next=null; 
 *  } 
 *  }
 */

/*
 * public void Insert_back(int data) { Node temp=new Node(); temp.data=data;
 * Node node=head; while(node.next!=null) { node=node.next; } node.next=temp;
 * temp.next=null; }
*/