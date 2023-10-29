package com.jsp.eager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Fruits f=new Fruits();
    	f.setFid(101);
    	f.setFname("Apple");
     Configuration con=new Configuration().addAnnotatedClass(Fruits.class).addAnnotatedClass(Vegetables.class);
     SessionFactory sf=con.buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     session.save(f);
     tx.commit();
     
    }
}
