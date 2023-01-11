package session8;

import java.util.Arrays;
import java.util.List;

public class StreamExercise {

	public static void main(String[] args) {
		Student student1=new Student("john", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1234"),new MobileNumber("1234")));
		Student student2=new Student("glen", 20, new Address("12345"),
				Arrays.asList(new MobileNumber("1111"),new MobileNumber("3333"),new MobileNumber("1233")));
		Student student3=new Student("cielo", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"),new MobileNumber("4444")));
		List<Student> students=Arrays.asList(student1,student2,student3);
		
	students.stream().filter(student->student.getName().equals("john")).forEach(System.out::println);
	}

}
