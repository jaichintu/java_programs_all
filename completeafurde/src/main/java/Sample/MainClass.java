package Sample;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
			System.out.println("1.Add\n2.fetch\n3.Update\n4.Remove\n5.Fetch All\n6.Exit");
			Scanner sc = new Scanner(System.in);
			switch (sc.nextInt()) {
			case 1: {
				Employee e = new Employee();
				System.out.println("Enter name");
				e.setEname(sc.next());
				System.out.println("Enter Salary");
				e.setEsalary(sc.nextDouble());
				System.out.println("Enter company name");
				e.setCompanyName(sc.next());
				System.out.println("Enter Address");
				e.setAddress(sc.next());
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter resume path");
				FileInputStream fi = new FileInputStream(sc2.nextLine());
				byte[] b = new byte[fi.available()];
				fi.read(b);
				e.setResume(b);
				t.begin();
				m.persist(e);
				t.commit();
				System.out.println("Added");

			}
				break;
			case 2: {
				System.out.println("Enter id");

				Employee e = m.find(Employee.class, sc.nextInt());
				if (e != null) {
					System.out.println("Id : " + e.getEid());
					System.out.println("Name : " + e.getEname());
					System.out.println("Salary : " + e.getEsalary());
					System.out.println("Address : " + e.getCompanyName());
					System.out.println("Company Name : " + e.getCompanyName());
					System.out.println("Enter Path");
					Scanner sc3 = new Scanner(System.in);
					FileOutputStream fs = new FileOutputStream(sc3.nextLine());
					fs.write(e.getResume());
					System.out.println("Fetched");
				} else
					System.out.println("Inavlid id");
			}
				break;
			case 3: {
				System.out.println("enter id");
				Employee e=m.find(Employee.class,sc.nextInt());
				if(e != null)
				{
					System.out.println("Enter new salary");
					e.setEsalary(sc.nextDouble());
					t.begin();
					m.merge(e);
					t.commit();
					
				}
			}
			
				break;
			case 4: {
				System.out.println("Enter id");
				Employee e=m.find(Employee.class, sc.nextInt());
				if(e != null)
				{
					t.begin();
					m.remove(e);
					t.commit();
				}
				else{
					System.out.println("invalid id");
				}
			}
			
				break;
			case 5: {
			Query q=m.createQuery("select a from Employee a");
			List<Employee> z=q.getResultList();
			for(Employee e : z)
			{
				System.out.println("ID :" + e.getEid());
				System.out.println("Name :" + e.getEname());
				System.out.println("Salary :" + e.getEsalary());
				System.out.println("Company Name :" + e.getCompanyName());
				System.out.println("Address :" + e.getAddress());
				
				
			}
			}
				break;
			case 6: {
				flag = false;
				System.out.println("thank you");
			}
				break;
			default: {
				System.out.println("!....Enter valid option....!");
			}
				break;
			}
		}
	}
}
