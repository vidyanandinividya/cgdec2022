import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;

import entity.Student;
import util.HibernateUtil;

public class NamedQueryDemo {

	public static void main(String[] args) {
		saveStudent();
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			//Executing named queries
			List<Object> totalStudents=session.
					createNamedQuery("GET_STUDENT_COUNT").getResultList();
			System.out.println("Total Students:"+totalStudents.get(0));
			
			List student=session.
					createNamedQuery("GET_STUDENT_BY_ID")
					.setParameter("id", 1)
					.getResultList();
			System.out.println(student.get(0));
			
			List<Student> students=session.
					createNamedQuery("GET_ALL_STUDENTS",Student.class)
					.getResultList();
			for(Student st:students)
			{
				System.out.println("ID:"+st.getId() +"\tName:"+st.getName());
			}
			transaction.commit();
			
		}
		catch (Exception e) {
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	
	}
	public static void saveStudent()
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//create new Student
			Student student=new Student("Ramesh", "ramesh@testmail.com");
			Student student1=new Student("Andrew", "andrew@testmail.com");
			Student student2=new Student("Cielo", "cielo@testmail.com");
			//save the instructor details
			session.save(student);
			session.save(student1);
			session.save(student2);
			//commit transaction
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
