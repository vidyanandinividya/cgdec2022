package session12;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Candidate{
	  //Write Your Code Here..
	  private String name;
	  private int id;
	  private int age;
	  private String gender;
	  private String department;
	  private int yearOfJoining;
	  private double salary;
	  public Candidate(int id,String name,int age,String gender,String department,int yearOfJoining,double salary){
		   super();
		   this.id= id;
		   this.name = name;
		   this.age = age;
		   this.gender = gender;
		   this.department = department;
		   this.yearOfJoining = yearOfJoining;
		   this.salary = salary;
		}
		public void setId(int id){
		   this.id = id;
		}
		public int getId(){
		   return this.id;
		}
		public void setName(String name){
		   this.name= name;
		}
		public String getName(){
		   return this.name;
		}
		public void setAge(int age){
		    this.age=age;
		}
		public int getAge(){
		   return this.age;
		}
		public void setGender(String gender){
		   this.gender = gender;
		}
		public String getGender(){
		   return this.gender;
		}
		public void setDepartment(String department){
		   this.department = department;
		}
		public String getDepartment(){
		   return this.department;
		}
		public void setYearOfJoining(int yearOfJoining){
		   this.yearOfJoining = yearOfJoining;
		}
		public int getYearOfJoining(){
		   return this.yearOfJoining;
		}
		public void setSalary(double salary){
		   this.salary = salary;
		}
		public double getSalary(){
		   return this.salary;
		}
		     @Override
		    public String toString() {
		        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
		                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
		    }
}
class Implementation{
	  //Write Your Code Here..
	  public static Map<String,Long> getCount(List<Candidate> list){
	    Map<String,Long> hm = list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
	    return hm;
	 
	  }
	public static Map<String,Double> getAverageAge(List<Candidate> list){
	   Map<String,Double> avgAge = list.stream().collect(Collectors.groupingBy(Candidate::getGender,Collectors.averagingInt(Candidate::getAge)));
	   return avgAge;
	}
	public static Map<String,Long> countCandidateDepartmentWise(List<Candidate>list){
	   Map<String,Long> countEmployee = list.stream().collect(Collectors.groupingBy(Candidate::getDepartment , Collectors.counting()));
	   return countEmployee;
	}
	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
	   Optional<Candidate> young = list.stream().filter(s->s.getGender().equals("Male") && s.getDepartment().equals("Product Development")).min(Comparator.comparingInt(Candidate::getAge));
	   return young;
	}
	 
	}
public class Source {

	 public static void main(String args[] ){
	        List<Candidate> list = new ArrayList<>();
	  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
	  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
	  System.out.println(new Implementation().countCandidateDepartmentWise(list));
	 
	    }

}
