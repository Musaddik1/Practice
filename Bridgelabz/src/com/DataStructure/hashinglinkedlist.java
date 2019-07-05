package com.DataStructure;

import com.DataStructure.Linkedlist.Node;

public class hashinglinkedlist
{
 
	
	 class Node
	 {
	 	Object data;
	 	Node next;
	 	
	 }
	 Node head=null;
	 public Node insert(int data)
		{
			Node node=new Node();
			node.data=data;
			node.next=head;
			head=node;
			return node;
			
		}
		public void delete()
		{
			Node temp=head;
			head=head.next;
			//delete(temp);
		}
		public void append(int data)
		{										 
			Node node=head;
			Node temp=new Node();
			temp.data=data;
			while(node!=null)
			{
				node=node.next;
			}
			node=temp.next;
			temp.next=null;
		
		}
		
			
		
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data!=null)
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		public boolean  Search(Node head,int key)
		{
			Node node=head;
			while(node!=null)
			{
				if(node.data.equals(key))
				{
					return true;
				}
				node=node.next;
			}
			return false;
		}
		
		public int size() {
			int count = 0;
			Node current = head;
			while(current!= null) 
			{
				current = current.next;
				count++;
			}
			return count;
			
		}
		public void IsEmpty()
		{
			Node node=head;
			if(node==null)
			{
				System.out.println("linkedlist is empty :");
			}
		}
		
		public void pop(int element)
		{
			Node node=head;
			Node temp=head;
			while(node!=null)
			{
				temp=temp.next;
				if(temp.data.equals(element))
				{
					node.next=temp.next;
					head=node;
					
				}
				node=node.next;
			}
			
		}
		public void Index(Node head,int index)
		{
			int count=1;
			Node node=head;
			while(node!=null)
			{
				if(count==index)
				{
					System.out.println("data present at "+index+" "+node.data);
				}
				node=node.next;
				count++;
			}
		}
		
 }
		