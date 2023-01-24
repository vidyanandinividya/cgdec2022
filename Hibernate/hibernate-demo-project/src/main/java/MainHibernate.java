import java.util.Scanner;

import dao.InstructorDao;
import entity.Instructor;
import entity.InstructorDetail;

public class MainHibernate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*Instructor instructor=new Instructor("john","smith", "john@testmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("http://www.youtube.com", "coding");
		instructor.setInstructorDetail(instructorDetail);
		InstructorDao instructorDao=new InstructorDao();
		instructorDao.saveInstructor(instructor);
		System.out.println("Enter the instructor you want to delete");
		int id=sc.nextInt();
		instructorDao.deleteInstructor(id);*/
		
		Instructor instructor=new Instructor("james","smith", "james@testmail.com");
		InstructorDetail instructorDetail=new InstructorDetail("http://www.youtube.com", "testing");
		//associate the objects
		instructorDetail.setInstructor(instructor);
		//associate the objects
		instructor.setInstructorDetail(instructorDetail);
		InstructorDao instructorDao=new InstructorDao();
		instructorDao.saveInstructor(instructor);
		instructorDao.getInstructor(1);
		//System.out.println(instructor);
		//System.out.println(instructorDetail);
		
	
		
	}

}
