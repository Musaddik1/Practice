package Singleton;

public class synchronize {
	
	static synchronize syn;
	private synchronize()
	{}
	public static synchronized synchronize getInstance()
	{
		if(syn==null)
		{
			syn=new synchronize();
			return syn;
		}
		return syn;
	}
	
	public static void main(String[] args) {
		
		synchronize syn=synchronize.getInstance();
		System.out.println(syn.hashCode());
	}
	
	

}
