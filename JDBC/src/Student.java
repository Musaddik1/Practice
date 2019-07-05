
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	
	
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement pstmt=null;
		ResultSet result=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDataBase","root","root");
			pstmt=connection.createStatement();
			result=pstmt.executeQuery("select * from Student");
			while(result.next())
			{
				System.out.println("Id :"+result.getInt(1));
				System.out.println("Name :"+result.getString(2));
			}
					
			
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			try 
			{
				connection.close();
			} 
			catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
