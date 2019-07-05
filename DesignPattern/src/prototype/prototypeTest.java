package prototype;

import java.util.ArrayList;

public class prototypeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emp=new Employees();
		emp.loadData();
		Employees emp1=(Employees) emp.clone();
		Employees emp2=(Employees) emp.clone();
		ArrayList<String> list=emp1.getEmp();
		list.add("john");
		ArrayList<String> list1=emp2.getEmp();
		list1.remove("abc");
		System.out.println("first :"+emp.getEmp());
		System.out.println("second :"+list);
		System.out.println("third :"+list1);
		
	}

}
