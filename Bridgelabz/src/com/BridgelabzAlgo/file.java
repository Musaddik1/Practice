package com.BridgelabzAlgo;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("prime.java");
		FileOutputStream fos=new FileOutputStream("test.txt");
		byte buffer[]=new byte[255];
		int length=0;
		while((length=fis.read(buffer))!=-1)
		{
			fos.write(buffer, 0, length);
			System.out.println("successful...");
		}
	}

}
