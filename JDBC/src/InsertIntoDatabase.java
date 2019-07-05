import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertIntoDatabase {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet result = null;
		Scanner scanner=new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDataBase","root","root");
			String query="insert into Student value(?,?)";
			ps=con.prepareStatement(query);
			System.out.println("How many record do you want to insert :");
			int number=scanner.nextInt();
			while(number>=1)
			{
			System.out.println("Enter Id :");
			int id=scanner.nextInt();
			System.out.println("Enter name :");
			String name=scanner.next();
			ps.setInt(1, id);
			ps.setString(2, name);
			int no=ps.executeUpdate();
			System.out.println(no);
			if(no!=0)
			{
				System.out.println("Record Inserted :");
			}
			number--;
			}
			con.close();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

}
