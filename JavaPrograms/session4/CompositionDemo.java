package session4;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	private String empName;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	public String getEmpName() {
		return empName;
	}
	
}
class Organization
{
	private String orgName;
	ArrayList<Employee> empList;  //Association
	public Organization(String orgName) {
		super();
		this.orgName = orgName;
	}
	public String getOrgName() {
		return orgName;
	}
	public List<String> getEmpList() {
		List<Employee> emp=this.empList;
		List<String> names=new ArrayList<String>();
		for(Employee e:emp)
		{
			names.add(e.getEmpName());
		}
		return names;
	}
	public void setEmpList() {
		
		//create three Employee objects
		Employee emp1=new Employee("John");
		Employee emp2=new Employee("Hary");
		Employee emp3=new Employee("Cielo");
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		this.empList=employees;
		
		
		
	}
	
	
}

public class CompositionDemo {

	public static void main(String[] args) {
		//create organization object
		Organization org=new Organization("CG");
		org.setEmpList();
		System.out.println("The employees employed in "+ org.getOrgName()
		+ " organization are: "+ org.getEmpList());

	}

}
