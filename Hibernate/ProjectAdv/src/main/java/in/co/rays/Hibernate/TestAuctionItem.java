package in.co.rays.Hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAuctionItem {
	
	public static void main(String[]args)  {
		
	/*	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		
		AuctionItem item = new AuctionItem();
		item.setId(1);
		item.setDescription("car");
	
		
		Bids b = new Bids();
		b.setAmount(1000);
		
		Set bids = new HashSet<Bids>();
		bids.add(b);
		
		item.setBids(bids);
		
		s.save(item);
		tx.commit();
		
		s.close();
		System.out.println("One to Many Inserted");
		*/
	    
		Employe e = new Employe();
		e.setFname("Abhi");
		e.setLname("patidar");
		
		Address a= new Address();
		
		a.setCity("indore");
		a.setState("mp");
		
		e.setAddress(a);
		a.setEmploye(e);
		
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction tx=s.beginTransaction();
		s.save(e);
		tx.commit();
		s.close();
		
		System.out.println("One to One Insertede");
      		
		
	}

}

        