package session12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmployee {

	
	
	@Test
	public void incrementSalary()
	{
		Employee[] arrOfEmps= {
				new Employee(1,"john",1000.0),
				new Employee(2,"jack",2000.0),
				new Employee(3,"Hary",3000.0)
				
		};
		List<Employee> empList=Arrays.asList(arrOfEmps);
		
	}
}
