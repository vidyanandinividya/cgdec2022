package util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import entity.Instructor;
import entity.InstructorDetail;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			try
			{
				Configuration configuration=new Configuration();
				//Hibernate setting equivalent to hibernate.cfg.xml properties
				Properties settings=new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/EmployeeDB");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "adminadmin");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.FORMAT_SQL, "true");
				settings.put(Environment.HBM2DDL_AUTO, "create-drop");
				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Instructor.class);
				configuration.addAnnotatedClass(InstructorDetail.class);
				ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java config service registry created");
				sessionFactory=configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

}
