package session7.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student
{
	String id;
	String name;
	int age;
	public Student(String id, String name, int age) {
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
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class ComparatorDemo {

	public static void sortByAge(List<Student> student)
	{
		Comparator<Student> ageComparator=(Student s1, Student s2)->{
			return s1.getAge()-s2.getAge();
		};
		student.sort(ageComparator);
	}
	public static void sortByName(List<Student> student)
	{
		Comparator<Student> nameComparator=(Student s1, Student s2)->{
			return - s1.getName().compareTo(s2.getName());
		};
		student.sort(nameComparator);
	}
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student("3", "Anil", 20));
		students.add(new Student("4", "Zeinab", 28));
		students.add(new Student("1", "Rohit", 22));
		System.out.println("Sort By Age in Ascending Order");
		sortByAge(students);
		students.forEach(st->System.out.println(st.toString()));
		System.out.println("Sort By Name in Ascending Order");
		sortByName(students);
		students.forEach(st->System.out.println(st.toString()));
		students.sort(
				Comparator.comparing(Student::getName)
				.thenComparing(Student::getAge,Comparator.reverseOrder())
				);
		System.out.println("Ordered by Name asc and Age desc");
		students.forEach(st->System.out.println(st.toString()));
		
		

	}

}
