package com.example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connectiontest {
	
	public static void main(String[] args) {
		
		ResultSet result=null;
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Connection1 connection1=context.getBean("connection",Connection1.class);
		Connection con=connection1.getConnection();
		if(con!=null)
			System.out.println("connection done");
		
		try
		{
			Statement stmt=con.createStatement();
			
			result=stmt.executeQuery("select * from userlogin");
			ResultSetMetaData data=result.getMetaData();
			int number=data.getColumnCount();
			while(result.next())
			{
				for(int i=1;i<=number;i++ )
				System.out.println(data.getColumnName(i)+" : "+result.getString(i));
				
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
