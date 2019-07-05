 package Singleton;

public class EagerInitialization {
	
	private static EagerInitialization eager=new EagerInitialization();
	
	private EagerInitialization()
	{
		
	}
	public static EagerInitialization getInstance()
	{
	
		System.out.println("instance got :");
		System.out.println(eager.hashCode());
		return eager;
	}
	
	public static void main(String[] args) {
		
		EagerInitialization eager1=null;
		
		eager1=EagerInitialization.getInstance();
		System.out.println(eager1.hashCode());
	}
	
}
