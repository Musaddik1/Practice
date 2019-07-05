import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet result=null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDataBase","root","root");
			String query="delete from Student where studentID=?";
			ps=con.prepareStatement(query);
			System.out.println("Enter Id :");
			int id=scanner.nextInt();
			ps.setInt(1, id);
			int no=ps.executeUpdate();
			if(no!=0)
			{
				System.out.println(no+"   Record Updated :");
			}
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}
