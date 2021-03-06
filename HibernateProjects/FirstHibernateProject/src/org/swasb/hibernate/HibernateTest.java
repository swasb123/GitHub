package org.swasb.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.swasb.dto.UserDetails;

public class HibernateTest {


	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserID(001);
		user.setUserName("First User");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
