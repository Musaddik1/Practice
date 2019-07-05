package prototype;

public class employeetest {
	
	
	public static void main(String[] args) 
	{
		
		Employee emp=new Employee("musaddik", 1, 20000);
		
		try 
		{
			Employee emp1=emp.clone();
			Employee emp2=emp.clone();
			
			emp1.setId(2);
			emp2.setName("ahmed");
			System.out.println("first :"+emp);
			System.out.println("second :"+emp1);
			System.out.println("third :"+emp2);
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
