package dao;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Instructor;
import util.HibernateUtil;

public class InstructorDao {
	public void saveInstructor(Instructor instructor)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//save the instructor details
			session.save(instructor);
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
	public void updateInstructor(Instructor instructor)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//save the instructor details
			session.update(instructor);
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
	public void deleteInstructor(int id)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//delete a instructor object
			Instructor instructor=session.get(Instructor.class, id);
			if(instructor!=null)
			{
				session.delete(instructor);
				System.out.println("Instructor is deleted");
			}
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
	public Instructor getInstructor(int id)
	{
		Transaction transaction=null;
		Instructor instructor=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//get the instructor object
			instructor=session.get(Instructor.class, id);
			System.out.println(instructor);
			//System.out.println(instructor.getInstructorDetail());
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
		return instructor;
	}
}
