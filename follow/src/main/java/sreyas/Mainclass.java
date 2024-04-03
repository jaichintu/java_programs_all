package sreyas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		
//		icone b=new icone();
//		b.setId(3);
//		b.setName("paul");
//		b.setSal(28);
//		
//		t.begin();
//		m.persist(b);
//		t.commit();
		
//		icone b=m.find(icone.class,1);
//		System.out.println("Name " +b.getName());
//		System.out.println("salary " +b.getSal());
		
//		icone b=m.find(icone.class, 3);
//		b.setSal(28000);
//		t.begin();
//		m.merge(b);
//		t.commit();
		
		icone b=m.find(icone.class, 3);
		t.begin();
		m.remove(b);
		t.commit();
	}

}
