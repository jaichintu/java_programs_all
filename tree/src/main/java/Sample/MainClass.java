package Sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainClass {
	public static void main(String[] args) throws IOException {
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		boolean flag = true;
		while (flag) {
			System.out.println("1.Add Student");
			System.out.println("2.Fetch Student");
			System.out.println("3.fetch All");
			System.out.println("4.Exit");
			System.out.println("Enter the valid option");
			Scanner sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1: {
				Student s = new Student();
				System.out.println("Enter name");
				s.setSname(sc.next());
				System.out.println("Enter gender");
				s.setSgender(sc.next().charAt(0));
				System.out.println("Enter the date");
				Date d = new Date(sc.next());
				s.setDate(d);
				System.out.println("Enter image path");
				Scanner sc2=new Scanner(System.in);
				FileInputStream fs=new FileInputStream(sc2.nextLine());
				byte[] arr=new byte[fs.available()];
				fs.read(arr);
				s.setImage(arr);
				t.begin();
				m.persist(s);
				t.commit();
				System.out.println("------------Added-----------");
			}
				break;
			case 2: {
				System.out.println("Enter id");
					Student s = m.find(Student.class, sc.nextInt());
					System.out.println("Name : "+s.getSname());
					System.out.println("Gender : "+s.getSgender());
					System.out.println("date : "+s.getDate());
					Scanner sc2=new Scanner(System.in);
					System.out.println("Enter path to see the image");
					FileOutputStream fs=new FileOutputStream(sc2.nextLine());
					fs.write(s.getImage());
			}
				break;
			case 3: {
				Query q = m.createQuery("select a from Student a");
				List<Student> w = q.getResultList();
				for(Student y:w)
				{
					System.out.println("Name : "+y.getSname());
					System.out.println("Gender : "+y.getSgender());
					System.out.println("date : "+y.getDate());
				}
			}break;
			case 4: {
				flag = false;
				System.out.println("Thank you");
			}
				break;

			default: {
				System.out.println("Invalid option");
			}
				break;
			}
		}
	}
}
