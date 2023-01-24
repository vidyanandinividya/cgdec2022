package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Instructor;
import entity.InstructorDetail;
import util.HibernateUtil;

public class InstructorDetailDao {
	public void saveInstructorDetails(InstructorDetail instructorDetail)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//save the instructor details
			session.save(instructorDetail);
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
	public void updateInstructorDetail(InstructorDetail instructorDetail)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//save the instructor details
			session.update(instructorDetail);
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
	public InstructorDetail getInstructorDetail(int id)
	{
		Transaction transaction=null;
		InstructorDetail instructorDetail=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//get an instructor object
			instructorDetail=session.get(InstructorDetail.class, id);
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
		return instructorDetail;
	}
}
