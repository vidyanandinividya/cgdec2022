package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetrieveRecordDemo {
	private final String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final String username = "postgres";
    private final String password = "adminadmin";
    private static final String SELECT_QUERY="select * from infoemployees";
    private static final String QUERY="select * from infoemployees where employeeid=?";
    
	
    public void getAllUser()
    {
    	try(Connection conn=DriverManager.getConnection(url,username,password);
    		/*PreparedStatement preparedStatement=conn.prepareStatement(SELECT_QUERY);*/
    			Statement statement=conn.createStatement();)
    	{
    		//ResultSet rs=preparedStatement.executeQuery();
    		ResultSet rs=statement.executeQuery(SELECT_QUERY);
    		System.out.println("id\tname\taddress\t\tcity\tcode\tcountry\tsalary");
    		while(rs.next())
    		{
    			int id=rs.getInt(1);
    			String name=rs.getString(2);
    			String address=rs.getString(3);
    			String city=rs.getString(4);
    			int code=rs.getInt(5);
    			String country=rs.getString(6);
    			int salary=rs.getInt(7);
    			
    			System.out.println(id+"\t"+name+"\t"+address+"\t"+city+"\t"+
    			code+"\t"+country+"\t"+salary);
    		}
    		
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
    public void getEmployeeById()
    {
    	try(Connection conn=DriverManager.getConnection(url,username,password);
    		Scanner sc=new Scanner(System.in);
    		PreparedStatement preparedStatement=conn.prepareStatement(QUERY);)
    	{
    		System.out.println("Enter the employee id");
    		int empid=sc.nextInt();
    		preparedStatement.setInt(1,empid);
    		ResultSet rs=preparedStatement.executeQuery();
    		System.out.println("id\tname\taddress\t\tcity\tcode\tcountry\tsalary");
    		while(rs.next())
    		{
    			int id=rs.getInt(1);
    			String name=rs.getString(2);
    			String address=rs.getString(3);
    			String city=rs.getString(4);
    			int code=rs.getInt(5);
    			String country=rs.getString(6);
    			int salary=rs.getInt(7);
    			
    			System.out.println(id+"\t"+name+"\t"+address+"\t"+city+"\t"+
    			code+"\t"+country+"\t"+salary);
    		}
    		
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
    public static void main(String[] args) {
		RetrieveRecordDemo obj=new RetrieveRecordDemo();
		//obj.getAllUser();
		obj.getEmployeeById();

	}

}
