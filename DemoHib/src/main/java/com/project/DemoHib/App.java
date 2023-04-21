package com.project.DemoHib;

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
    	AlienName an=new AlienName();
    	an.setFname("NaveenKumarReddy");
    	an.setMname("BadReddy");
    	an.setLname("Thatipalli");
    	
        Alien telusco=new Alien();
        telusco.setAid(102);
        telusco.setAname(an);
        telusco.setColor("Red");
        
        Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
//        Configuration con=new Configuration().configure("hibernate.cgf.xml");
        SessionFactory sf=con.buildSessionFactory();
        
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        //session.beginTransaction();
        
        session.save(telusco);                 //*********************
        
        //session.getTransaction.commit();
//        telusco=(Alien)session.get(Alien.class, 102);
//        System.out.println(telusco);
        
        tx.commit();
    }
}
