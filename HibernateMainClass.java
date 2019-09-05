package com.example.hibernate.helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 1. Create a new project
 * 2. Adding Hibernate/lib/required to the build path
 * 3. in the default location of your source : create a hibernate.cfg.xml
 * 4. Add a mapping resource file : <mapping resource="message.hbm.xml" />
 * 5. Create a mapping resource file with the same name
 * 6. Based on mapping I create the message class
 * 
 * @author AdityaDua
 *
 */
public class HibernateMainClass {

	private static SessionFactory factory;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		factory = new Configuration().configure().buildSessionFactory();
		Message message  = new Message();
		message.setMessageText("Hello World!");
		Session session =factory.openSession();
		
		
		 //factory.getCurrentSession();
		//Transaction tnx = session.beginTransaction();
		Integer idInserted= (Integer)session.save(message);
		System.out.println("ID inserted is:"+idInserted);
		//tnx.commit();
		session.close();
		
		
	}

}