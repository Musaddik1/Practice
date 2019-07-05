package Singleton;

public class innerclass {
	

	private innerclass() {}
	 static class helper
	{
		private static innerclass in=new innerclass();
	}
	 public static innerclass getInstance()
	 {
		 return helper.in;
	 }
	
	 
	 
	 public static void main(String[] args) {
		
		 innerclass.helper he=new innerclass.helper();
		 innerclass h1=innerclass.getInstance();
		 System.out.println(he.hashCode());
		 System.out.println(h1.hashCode());
	}
	
}
