import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Karthikeyan2201");
			System.out.println("successful connection");
		}
		catch(SQLException err)
		{
			System.out.println(err);
		}
			
	return con;
	}
	

}
