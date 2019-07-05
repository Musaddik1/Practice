package Singleton;

public class lazyInitialization {
	
	static lazyInitialization lazy;
	
	private lazyInitialization()
	{
		
	}
	public static lazyInitialization getInstance()
	{
		if(lazy==null)
		{
			lazy=new lazyInitialization();
			
			return lazy;
		}
		return lazy;
	}
	
	public static void main(String[] args) {
		
		lazyInitialization lazy=lazyInitialization.getInstance();
		System.out.println(lazy.hashCode());
	}
}
