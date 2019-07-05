package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflection {
	
	public static reflection instance=new reflection();
	
	private reflection()
	{
		
	}
	public static reflection getInstance()
	{
		return instance;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		 reflection instance1=reflection.getInstance();
		  reflection instance2 = null;
		  Constructor constructors[]=reflection.class.getConstructors();
		  
		  for(Constructor constructor:constructors)
		  {
			  constructor.setAccessible(true);
			  instance2=(reflection)  constructor.newInstance(); 
			 
			  }
		  System.out.println("instance1 "+instance1.hashCode());
		  System.out.println("instance2 "+instance2.hashCode());
	}

}
