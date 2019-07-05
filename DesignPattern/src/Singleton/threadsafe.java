package Singleton;

public class threadsafe {
	
	static threadsafe thread;
	private threadsafe()
	{
		
	}
	public static threadsafe getInstance()
	{
		if(thread==null)
		{
			synchronized (threadsafe.class) 
			{
				
				if(thread==null)
				{
					thread=new threadsafe();
				}
			}
			
			return thread;
		}
		return thread;
	}
	
	public static void main(String[] args) {
		
		threadsafe safe=threadsafe.getInstance();
		System.out.println(safe.hashCode());
	}

}
