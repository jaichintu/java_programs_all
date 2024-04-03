package Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
		Aadhaar r=new Aadhaar();
		r.setaNo(1236786718);
		r.setAddress("banglore");
		
		Person p=new Person();
		p.setName("mallesh");
		p.setPhoneNo(745698751);
		p.setAge(22);
		
		p.setA(r);
		t.begin();
		m.persist(r);
		m.persist(p);
		t.commit();
	}
	
	
	
	
	

}
