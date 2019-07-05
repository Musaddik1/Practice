 interface test1{}
public class reflection {
	
	
	public reflection() {}
	public void display()
	{
		System.out.println("displaying :");
	}
	public int display(int no)
	{
		System.out.println("displaying");
		return no;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
		reflection ref=new reflection();
		Class c=ref.getClass();
		Class c1=Class.forName("test1");
		System.out.println(c1.isInterface());
		System.out.println(c.getName());
		
	}

}
