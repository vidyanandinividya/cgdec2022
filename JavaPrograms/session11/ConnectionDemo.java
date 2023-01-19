package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	
	private final String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final String username = "postgres";
    private final String password = "adminadmin";
	public Connection connect()
	{
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,username,password);
		if(conn!=null)
		{
			System.out.println("Connected to the server successfully");
		}
		else
		{
			System.out.println("Failed to make connection");
		}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
		
	}

	public static void main(String[] args) {
		ConnectionDemo obj=new ConnectionDemo();
		obj.connect();
	}

}
