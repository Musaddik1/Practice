package com.example.demo;

public class Financial implements Department{

	private String departmentName;
	public Financial()
	{}
	 
	public Financial(String departmentName) {
		
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}
	
	@Override
	public void getDepartment() {
		System.out.println(" Department Name..."+  departmentName);
		
	}

}
