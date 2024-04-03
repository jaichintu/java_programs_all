package controller;

import java.util.Scanner;

import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;

import dao.Studentdao;
import dto.Student;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Studentdao dao = new Studentdao();
		boolean flag = true;
		while (flag) {
			System.out.println("1.Add\n2.Fetch\n3.Update\n4.remove\n5.Fetchall\n6.Exit");
			switch (sc.nextInt()) {
			case 1: {
				Student s=new Student();
				System.out.println("enter name");
				s.setName(sc.next());
				System.out.println("enter percentage");
				s.setPercentage(sc.nextDouble());
				System.out.println("enter address");
				s.setAddress(sc.next());
				dao.addStudent(s);
							
			}

				break;
			case 2: {
				
				System.out.println("enter id");
				dao.fetchStudent(sc.nextInt());

			}

				break;
			case 3: {
				System.out.println("enter id ");
				int id=sc.nextInt();
				System.out.println("enter new name");
				String newName = sc.next();
				dao.updateStudent(id, newName);

			}

				break;
			case 4: {
				System.out.println("enter id");
				dao.removeStudent(sc.nextInt());
			}

				break;
			case 5: {
				dao.fetchAll();

			}

				break;
			case 6: {
				flag=false;
				System.out.println("Thank you");

			}

				break;

			default:
				System.out.println("invalid option");
				break;
			}
		}
	}

}
