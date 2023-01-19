package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecordDemo {
	private final String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final String username = "postgres";
    private final String password = "adminadmin";
    private static final String UPDATE_USERS="update users set name=? where id=?;";
    		
	public static void main(String[] args) {
		new UpdateRecordDemo().updateRecord();

	}
	public void updateRecord()
	{
		try(Connection conn=DriverManager.getConnection(url,username,password);
	    		Scanner sc=new Scanner(System.in);
	    		PreparedStatement preparedStatement=conn.prepareStatement(UPDATE_USERS);)
	    	{
				System.out.println("Enter the name");
				String name=sc.next();
				System.out.println("Enter the id");
				int id=sc.nextInt();
	    		preparedStatement.setString(1,name);
	    		preparedStatement.setInt(2, id);
	    		int result=preparedStatement.executeUpdate();
	    		if(result>0)
	    		{
	    			System.out.println("Data updated successfully");
	    		}
	    		else
	    		{
	    			System.out.println("Data not updated");
	    		}
	    		
	    	}
	    	catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}

}
