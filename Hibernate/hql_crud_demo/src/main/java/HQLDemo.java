import java.util.List;

import dao.EmployeeDao;
import entity.EmployeeCG;

public class HQLDemo {

	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
		EmployeeCG cg=new EmployeeCG("John", "Smith", "johnsmith@testmail.com");
		EmployeeCG cg1=new EmployeeCG("Jack", "Smith", "jack@testmail.com");
		EmployeeCG cg2=new EmployeeCG("James", "Smith", "james@testmail.com");
		EmployeeCG cg3=new EmployeeCG("Tom", "Smith", "tom@testmail.com");
		employeeDao.saveEmployee(cg);
		employeeDao.saveEmployee(cg1);
		employeeDao.saveEmployee(cg2);
		employeeDao.saveEmployee(cg3);
		employeeDao.insertEmployee();
		
		//Update Employee
		/*EmployeeCG cg1=new EmployeeCG();
		cg1.setFirstName("Ram");
		employeeDao.updateEmployee(cg1);*/
		
		//Delete Employee
		//employeeDao.deleteEmployee(2);
		
		//Get All Employees
		List<EmployeeCG> employeeCG=employeeDao.getEmployees();
		System.out.println(employeeCG);
		
		//Get Single Employee
		EmployeeCG employeeCG2=employeeDao.getEmployee(2);
		System.out.println(employeeCG2);

	}

}
