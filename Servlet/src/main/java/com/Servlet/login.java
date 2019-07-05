package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet result=null;

	
		
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try 
		{

			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","root");
			stmt=con.prepareStatement("select * from userlogin where username=? and password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			result=stmt.executeQuery();
			out.print("<html>");
			if(result.next())
			{
				
				out.print("<font color='green'>You have successufully Logined</font>");
			}
			else
			{
				out.print("<font color='red>Please enter valid username and password</font>");
				request.getRequestDispatcher("index.jsp").include(request, response);
				out.print("</html>");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
