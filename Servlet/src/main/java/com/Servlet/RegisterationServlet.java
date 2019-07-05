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

/**
 * Servlet implementation class RegisterationServlet
 */
public class RegisterationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet result = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root",
			  "root"); System.out.println("connection done ");
			  stmt=con.prepareStatement("insert into userlogin values(?,?,?,?,?,?,?,?)");
			  
			  PrintWriter out=response.getWriter(); 
			  
			  String username=request.getParameter("username"); 
			  String password=request.getParameter("password");
			  String confirm=request.getParameter("confirm"); 
			  String first=request.getParameter("first"); 
			  String last=request.getParameter("last");
			  String DOB=request.getParameter("DOB");
			  String mobile=request.getParameter("mobile"); 
			 String email=request.getParameter("email"); 
				  stmt.setString(1, username);
				  stmt.setString(2, password);
				  stmt.setString(3, confirm);
				  stmt.setString(4,first); 
				  stmt.setString(5, last); 
				  stmt.setString(6, DOB); 
				  stmt.setString(7,mobile); 
				  stmt.setString(8, email); 
				  if(password.equals(confirm))
				  {
					  int number=stmt.executeUpdate(); 
					  System.out.println(number+ "  Record Inserted :");
				  }
				  else
				  { 
					  out.print("<html>");
					  out.print("<font color='red'>Enter all field correct ");
					  out.print("</html>");
					  request.getRequestDispatcher("Registration.jsp").include(request, response);
				  }
			  }
			  catch (Exception e)
				{
					e.printStackTrace();
				}
				  
				   
	}	
		
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
