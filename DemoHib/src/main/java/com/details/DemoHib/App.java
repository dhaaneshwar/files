package com.details.DemoHib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student student=new Student();
		student.setName("Naveen");
		student.setMarks(50);
		student.setRollno(1);
		student.getLaptop().add(laptop);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(laptop);
		session.save(student);
		
		tx.commit();
	}

}
