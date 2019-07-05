package com.DataStructure;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DequeuePalindrome {
	char array[] = new char[10];
	int rear = 0;
	int front = 0;

	public void Insert_back(char no) {
		if (IsFull()) {
			System.out.println("Overflow");
		} else {
			array[rear] = no;
			rear++;
		}
	}

	public void Insert_front(char no) {
		if (IsFull()) {
			System.out.println("Overflow");
		} else {
			for (int i = rear; i > front; i--) {
				array[i] = array[i - 1];
			}
			array[front] = no;
			rear++;

		}

	}

	public char Delete_back() {
		if (IsEmpty()) {
			System.out.println("Underflow");
			return ' ';
		} else {
			rear--;
			char ch = array[rear];

			return ch;
		}
	}

	public char Delete_front() {
		if (IsEmpty()) {
			System.out.println("Underflow");
			return ' ';
		} else {
			char ch = array[front];
			front++;

			return ch;
		}
	}

	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.println(array[i]);
		}
	}

	public int Size() {
		int count = 0;
		for (int i = front; i < rear; i++) {
			count++;
		}
		return count;
	}

	public boolean IsEmpty() {
		if (front == rear) {
			return true;

		} else {
			return false;
		}
	}

	public boolean IsFull() {
		if (rear == array.length) {
			return true;
		} else {
			return false;
		}
	}
	
		
	
	public static void main(String[] args) {

		Utility uti=new Utility();
		DequeuePalindrome dequeue = new DequeuePalindrome();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String :");
		String string = uti.inputString();
		char ch[] = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			dequeue.Insert_front(ch[i]);
		}
		String string1="";
		for(int i=0;i<ch.length;i++)
		{
			string1=string1+dequeue.Delete_front();
		}
		if(string1.compareTo(string)==0)
		{
			System.out.println("Palindrome String :");
		}
		else
		{
			System.out.println("Not Palindrome String :");
		}
	}

}
