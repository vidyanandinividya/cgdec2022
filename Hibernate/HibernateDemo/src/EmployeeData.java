
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class EmployeeData {

	public static void main(String[] args) {
		/*StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().
				configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();*/
		Configuration configuration=new Configuration().configure();
		//configuration.addResource("employee.hbm.xml");
		configuration.addAnnotatedClass(Employee.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().
				applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		Session session=factory.openSession();
		Transaction transaction=null;
		try
		{
		transaction=session.beginTransaction();
		Employee e1=new Employee();
		//e1.setId(102);
		e1.setFirstName("James");
		e1.setLastName("Smith");
		session.save(e1);
		transaction.commit();
		System.out.println("Successfully saved");
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		
		List<Employee> employees=
				session.createQuery("from Employee",Employee.class).list();
		employees.forEach(emp->System.out.println(emp));
		factory.close();
		session.close();
		
	}	
	

}
