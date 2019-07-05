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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetPassword
 */
public class SetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet result=null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String password=request.getParameter("password");
		String confirm=request.getParameter("confirm");
		try 
		{
			String username=(String) session.getAttribute("username");
			System.out.println(username);
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","root");
			stmt=con.prepareStatement(" update userlogin set password=? , confirm=? where username=? ");
			stmt.setString(1, password);
			stmt.setString(2, confirm);
			stmt.setString(3, username);
			int number=stmt.executeUpdate();
			System.out.println(number);
			if(password.equals(confirm))
			{
				
					out.print("<html>");
					out.print("<font color='green'>You have  successfully changed password</font>");
					
				
			}
			else
			{
				out.print("<font color='red'>Please enter same password</font>");
				request.getRequestDispatcher("setpassword.jsp").include(request, response);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
