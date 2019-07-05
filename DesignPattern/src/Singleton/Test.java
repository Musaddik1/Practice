package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
			////////////threadsafe/////////////////////
		  synchronize syn=synchronize.getInstance();
		  System.out.println(syn.hashCode());
		  threadsafe thread=threadsafe.getInstance();
		  System.out.println(thread.hashCode());
		  innerclass.helper he=new innerclass.helper(); innerclass
		  inner=innerclass.getInstance(); System.out.println(inner.hashCode());
		 
		  ///////////////////reflection/////////////////////////
		  reflection instance1=reflection.instance;
		  reflection instance2=null;
		  Constructor constructors[]=reflection.class.getConstructors();
		  for(Constructor constructor:constructors)
		  {
			  instance2=(reflection)
		  constructor.newInstance(); 
			  break; 
			  }
		  System.out.println("instance1"+instance1.hashCode());
		  System.out.println("instance2"+instance2.hashCode());
		 ////////////serialization////////////////
		String pathname="/home/admin123/eclipse-workspace"
				+ "/DesignPattern/src/Singleton/data.text";
		serialization instance3=serialization.getInstance();
		ObjectOutput out=null;
		out=new ObjectOutputStream(new FileOutputStream(pathname));
		out.writeObject(out);
		out.close();
		ObjectInput in=new ObjectInputStream(new FileInputStream(pathname));
		reflection instance4=(reflection)in.readObject();
		System.out.println(instance3.hashCode());
		System.out.println(instance4.hashCode());
		
	}

}
