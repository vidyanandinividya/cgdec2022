package session11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {
	private final String url = "jdbc:postgresql://localhost/EmployeeDB";
    private final String username = "postgres";
    private final String password = "adminadmin";
    private static final String createTable="create table users"
    		+ "(id int primary key,"+"name varchar(50),"+
    		"country varchar(50))";
    public void createTable()
    {
    	try(Connection conn=DriverManager.getConnection(url,username,password);
    		Statement statement=conn.createStatement();)
    	{
    		boolean result=statement.execute(createTable);
    		if(result)
    		{
    			System.out.println("Table created successfully");
    		}
    		else
    		{
    			System.out.println("Table has not been created");
    		}
    	}
    	catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	public static void main(String[] args) {
		
		new CreateTableDemo().createTable();
	}

}
