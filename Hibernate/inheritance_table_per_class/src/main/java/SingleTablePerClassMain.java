import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Account;
import entity.CreditAccount;
import entity.DebitAccount;
import util.HibernateUtil;

public class SingleTablePerClassMain {

	public static void main(String[] args) {
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			//save the account object
			Account account=new Account();
			account.setBalance(10000.0);
			account.setInterestRate(10.0);
			account.setOwner("John");
			session.save(account);
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
