package session7.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	String id;
	String name;
	int age;
	public Employee(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.id.compareTo(emp.id);
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("1","john",22));
		employees.add(new Employee("3","john1",20));
		employees.add(new Employee("2","john2",27));
		employees.add(new Employee("7","john3",32));
		employees.add(new Employee("4","john4",34));
		Collections.sort(employees);
		employees.forEach(emp->System.out.println(emp.toString()));

	}

}
