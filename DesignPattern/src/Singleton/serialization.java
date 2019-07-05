package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization implements Serializable{
	
	private static  serialization instance=new serialization();
	
	private serialization()
	{
		System.out.println("constructor called :");
	}
	
	public static serialization getInstance()
	{
		return instance;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String pathname="/home/admin123/eclipse-workspace"
				+ "/DesignPattern/src/Singleton/data.text";
		serialization instance3=serialization.getInstance();
		ObjectOutput out=null;
		out=new ObjectOutputStream(new FileOutputStream(pathname));
		out.writeObject(instance3);
		
		ObjectInput in=new ObjectInputStream(new FileInputStream(pathname));
		serialization instance4=(serialization) in.readObject();
		System.out.println(instance3.hashCode());
		System.out.println(instance4.hashCode());
		out.close();
		in.close();
	}
}
