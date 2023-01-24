package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.EmployeeCG;

import util.HibernateUtil;

public class EmployeeDao {
	public void saveEmployee(EmployeeCG cg)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//save the instructor details
			session.save(cg);
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
	public void insertEmployee()
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			String hql="insert into EmployeeCG(firstName,lastName,email)"+
					"select firstName,lastName,email from EmployeeCG";
			Query query=session.createQuery(hql);
			int result=query.executeUpdate();
			System.out.println("Rows affected"+result);
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
	public void updateEmployee(EmployeeCG cg)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			String hql="update EmployeeCG set firstName= :firstName "+
			"where id= :empId";
			Query query=session.createQuery(hql);
			query.setParameter("firstName", cg.getFirstName());
			query.setParameter("empId", 2);
			int result=query.executeUpdate();
			System.out.println("Rows affected"+result);
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
	public void deleteEmployee(int id)
	{
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//Delete an employee object
			EmployeeCG cg=session.get(EmployeeCG.class, id);
			String hql="delete from EmployeeCG "+
			"where id= :empId";
			Query query=session.createQuery(hql);
			query.setParameter("empId", id);
			int result=query.executeUpdate();
			System.out.println("Rows affected"+result);
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
	public EmployeeCG getEmployee(int id)
	{
		Transaction transaction=null;
		EmployeeCG employeeCG=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			//start a transaction
			transaction=session.beginTransaction();
			//Get an employee object
			
			String hql="from EmployeeCG cg where cg.id= :empId";
			Query query=session.createQuery(hql);
			query.setParameter("empId", id);
			List results=query.getResultList();
			if(results!=null && !results.isEmpty())
			{
				employeeCG=(EmployeeCG)results.get(0);
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
		return employeeCG;
	}
public List<EmployeeCG> getEmployees()
{
	
	Session session=HibernateUtil.getSessionFactory().openSession();
		
	return session.createQuery("from EmployeeCG",EmployeeCG.class).list();
}
}
