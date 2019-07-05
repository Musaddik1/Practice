package Singleton;

public class staticblock {

	static staticblock block=null;
	static
	{
		block=new staticblock();
	}
	private staticblock()
	{
		
	}
	public static staticblock getInstance()
	{
		System.out.println(block.hashCode());
		return block;
	}
	
	public static void main(String[] args) {
		
		
		staticblock block1=staticblock.getInstance();
		System.out.println(block1.hashCode());
	}
}
