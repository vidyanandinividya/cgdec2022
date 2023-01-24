import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Account;
import entity.CreditAccount;
import entity.DebitAccount;
import util.HibernateUtil;

public class MappedClassMain {

	public static void main(String[] args) {
		Transaction transaction=null;
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			//save the account object
			CreditAccount account=new CreditAccount();
			account.setBalance(10000.0);
			account.setInterestRate(10.0);
			account.setOwner("John");
			account.setCreditLimit(10000.0);
			session.save(account);
			DebitAccount debitAccount=new DebitAccount();
			debitAccount.setBalance(10000.0);
			debitAccount.setInterestRate(10.0);
			debitAccount.setOwner("John");
			debitAccount.setOverdraftFee(100.0);
			session.save(debitAccount);
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			transaction=session.beginTransaction();
			CreditAccount creditAccount=session.get(CreditAccount.class, 1L);
			System.out.println(creditAccount.getBalance());
			System.out.println(creditAccount.getId());
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
