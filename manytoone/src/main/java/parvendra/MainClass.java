package parvendra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	Student s=new Student();
	s.setAge(1);
	s.setName("simon");
	
	
	Markscard m1=new Markscard();
	m1.setDegree("sslc");
	m1.setPercentage(0.5);
	m1.setS(s);
	Markscard m2=new Markscard();
	m2.setDegree("puc");
	m2.setPercentage(25.87);
	m2.setS(s);
	
	Markscard m3=new Markscard();
	m3.setDegree("MCA");
	m3.setPercentage(45.67);
	m3.setS(s);
	
	
	t.begin();
	m.persist(m1);
	m.persist(s);
	m.persist(m2);
	m.persist(m3);
	t.commit();
	
	
	
}
}
