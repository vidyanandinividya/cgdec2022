package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TransactionDemo {
	private final String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final String username = "postgres";
    private final String password = "adminadmin";
    private static final String DELETE_USERS="delete from users where id=?;";
    		
	public static void main(String[] args) {
		new TransactionDemo().deleteRecord();

	}
	public void deleteRecord()
	{
		try(Connection conn=DriverManager.getConnection(url,username,password);
	    		Scanner sc=new Scanner(System.in);
	    		PreparedStatement preparedStatement=conn.prepareStatement(DELETE_USERS);)
	    	{
				System.out.println("Enter the id");
				int id=sc.nextInt();
	    		preparedStatement.setInt(1, id);
	    		int result=preparedStatement.executeUpdate();
	    		if(result>0)
	    		{
	    			System.out.println("Data deleted successfully");
	    		}
	    		else
	    		{
	    			System.out.println("Data not deleted");
	    		}
	    		
	    	}
	    	catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

}
