package prototype;

import java.util.ArrayList;

public class Employees implements Cloneable {
	
	
	ArrayList<String> list;
	public Employees()
	{
		list=new ArrayList<String>();
	}
	public Employees(ArrayList<String> list)
	{
		this.list=list;
		
	}
	public ArrayList<String> loadData()
	{
		list.add("abc");
		list.add("xyz");
		list.add("pqr");
		return list;
	}
	public ArrayList<String> getEmp()
	{
		return list;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		ArrayList<String> temp=new ArrayList<String>();
		for(String s:this.getEmp())
		{
			temp.add(s);
		}
		return new Employees(temp);
	}
	@Override
	public String toString() {
		return "Employees [list=" + list + "]";
	}
	
}
