package in.co.rays.tps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestPayment {
	
    public static void main(String[] args)   {  
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	Session s = sessionFactory.openSession();
	
	Transaction tx = s.beginTransaction();
	CreditCardPayment card = new CreditCardPayment();
	
	card.setName("bhupendra");
	card.setAmount(54000);
	card.setCctype("visa");
	
	s.save(card);
	
	Cheque ch = new Cheque();
	ch.setName("vivek");
	ch.setAmount(30000);
	ch.setChequeNo(88888);
	
	s.save(ch);
	tx.commit();
	s.close();
	
	
	System.out.println("payment done");
	
	
     

}
}