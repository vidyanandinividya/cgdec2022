package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordDemo {
	private final static String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final static String username = "postgres";
    private final static String password = "adminadmin";
    private static final String INSERT_USERS="insert into users"
    		+"(id,name,country) values"+ "(?,?,?);";
    private static final String UPDATE_USERS="update users set name=? where id=?;";
    		
	public static void main(String[] args) {
		
		try(Connection conn=DriverManager.getConnection(url,username,password);)
		{
			conn.setAutoCommit(false);
			try(PreparedStatement insertPrepare=conn.prepareStatement(INSERT_USERS);
				PreparedStatement updatePrepare=conn.prepareStatement(UPDATE_USERS);
				Scanner sc=new Scanner(System.in);)
			{
				//Create insert statement
				insertPrepare.setInt(1, 5);
				insertPrepare.setString(2,"Tony");
				insertPrepare.setString(3, "UK");
				insertPrepare.executeUpdate();
				
				//Create update statement
				updatePrepare.setString(1, "Alok");
				updatePrepare.setInt(2, 1);
				updatePrepare.executeUpdate();
				
				//Commit
				conn.commit();
				System.out.println("Transaction is committed successfully");
				
				
				
			}
			catch(SQLException e)
			{
				if(conn!=null)
				{
					try
					{
						System.out.println("Transaction is being Rolled back");
						conn.rollback();
					}
					catch(Exception ex)
					{
						System.out.println(ex.getMessage());
					}
				}
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
