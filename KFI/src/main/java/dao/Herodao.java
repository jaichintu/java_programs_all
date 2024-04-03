package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Hero;

public class Herodao {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	public void addHero(Hero s){
		t.begin();
		m.persist(s);
		t.commit();
	}
	public void fetchHero(int id) throws IOException{
		Hero s=m.find(Hero.class, id);
		if(s != null){
			System.out.println(s.getId());
			System.out.println(s.getHeroName());
			System.out.println(s.getMovieBudget());
			System.out.println(s.getHeroineName());
			System.out.println(s.getDirectorName());
			System.out.println(s.getMovieName());
			System.out.println(s.getReleaseDate());
			FileOutputStream fs = new FileOutputStream(
					"C:\\Users\\hp\\Desktop\\hibernate\\" + s.getHeroName() + ".jpg");
			fs.write(s.getPhoto());
		}
		else{
			System.out.println("data not found");
		}
	}
	public void removeHero(int id){
		Hero s=m.find(Hero.class, id);
		if(s != null)
		{
			t.begin();
			m.remove(s);
			t.commit();
		}
		else{
			System.out.println("data not found");
		}
	}
	public void updateDate(int id, Date releaseDate){
		Hero s=m.find(Hero.class, id);
		
		if(s != null){
			s.setReleaseDate(releaseDate);
			t.begin();
			m.merge(s);
			t.commit();
		}
		else{
			System.out.println("data not found");
		}
	}
	public void DisplayAll() throws IOException{
		Query q=m.createQuery("select a from Hero a");
		List<Hero> s=q.getResultList();
		for(Hero w:s){
			System.out.println(w.getId());
			System.out.println(w.getHeroName());
			System.out.println(w.getHeroineName());
			System.out.println(w.getDirectorName());
			System.out.println(w.getMovieBudget());
			System.out.println(w.getMovieName());
			System.out.println(w.getReleaseDate());
			FileOutputStream fs=new FileOutputStream("C:\\Users\\hp\\Desktop\\hibernate\\" + w.getHeroName() + ".jpg");
			fs.write(w.getPhoto());
		}
	}

}
