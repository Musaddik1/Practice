package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection1 {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	
	public Connection1()
	{
		
	}


	public Connection1(String driver, String url, String username, String password) {
		
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}


	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public Connection getConnection()
	{
		Connection con=null;
		try 
		{
			
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			return con;
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
