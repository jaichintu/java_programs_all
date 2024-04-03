package Tester;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Student s1=new Student();
		s1.setName("rajkumar");
		s1.setDegree("Btech");
		s1.setpNo(994236798);
		
		Student s2=new Student();
		s2.setName("surya");
		s2.setDegree("MCA");
		s2.setpNo(724536123);
		
		ArrayList l=new ArrayList();
		l.add(s1);
		l.add(s2);
		
		Jspiders j=new Jspiders();
		j.setAddress("bangalore");
		j.setContactNo(775642222);
		j.setS(l);
		
		t.begin();
		m.persist(j);
		m.persist(s1);
		m.persist(s2);
		t.commit();
	}

}
