package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SaveClient {
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
	Transaction txn=s.beginTransaction();
		
		Student st=new Student();
		st.setId(111);
		st.setName("balu");
		st.setEmail("balu@gmail.com");
		st.setAddress("hyd");
		
		s.save(st);
		txn.commit();
		s.close();
		sf.close();
		
	}

}
