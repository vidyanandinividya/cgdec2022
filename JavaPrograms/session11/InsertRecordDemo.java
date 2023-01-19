package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertRecordDemo {
	private final String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final String username = "postgres";
    private final String password = "adminadmin";
    private static final String INSERT_USERS="insert into users"+
    "(id,name,country) values"+"(?,?,?)";
    private static final String QUERY="select * from users";
	public static void main(String[] args) {
		//new InsertRecordDemo().insertRecord();
	new InsertRecordDemo().insertUsers(Arrays.asList(new User(2,"jack","India")
			,new User(3,"hary","Japan"),new User(4,"james","India")));
		
	}
	public void insertRecord()
    {
    	try(Connection conn=DriverManager.getConnection(url,username,password);
    		Scanner sc=new Scanner(System.in);
    		PreparedStatement preparedStatement=conn.prepareStatement(INSERT_USERS);)
    	{
    		System.out.println("Enter the id");
    		int id=sc.nextInt();
    		System.out.println("Enter the name");
    		String name=sc.next();
    		System.out.println("Enter the country");
    		String country=sc.next();
    		preparedStatement.setInt(1, id);
    		preparedStatement.setString(2, name);
    		preparedStatement.setString(3, country);
    		int result=preparedStatement.executeUpdate();
    		if(result>0)
    		{
    			System.out.println("The data inserted successfully");
    		}
    		else
    		{
    			System.out.println("The data not inserted");
    		}
    	}
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	public void insertUsers(List<User> list)
	{
		try(Connection conn=DriverManager.getConnection(url,username,password);
			PreparedStatement preparedStatement=conn.prepareStatement(INSERT_USERS);)
		{
			int count=0;
			for(User user:list)
			{
				preparedStatement.setInt(1, user.getId());
				preparedStatement.setString(2, user.getName());
				preparedStatement.setString(3, user.getCountry());
				preparedStatement.addBatch();
				count++;
				if(count%100==0||count==list.size())
				{
					preparedStatement.executeBatch();
					System.out.println("Record inserted");
				}
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
