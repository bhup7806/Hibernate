package in.co.rays.inher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPayment {
	
	public static void main(String[] args) {
		 CreditCardPayment card = new CreditCardPayment();
		 card.setId(1);
		 card.setAmount(10000);
		 card.setCcType("visa");
		 
		 Cheque ch = new Cheque();
		 ch.setId(2);
		 ch.setAmount(12000);
		 ch.setChequeNo(452016);
		 
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session s = sessionFactory.openSession();
			
			Transaction tx = s.beginTransaction();
			s.save(card);
			s.save(ch);
			tx.commit();
			s.close();
			
			System.out.println("payment done");
		 
		
	}

}
