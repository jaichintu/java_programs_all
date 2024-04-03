package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import dao.Studentdao;
import dto.Student;

public class MainClass {
	public static void main(String[] args) throws IOException {
		Studentdao s=new Studentdao();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			
			System.out.println("1.Add student");
			System.out.println("2.Fetch Student");
			System.out.println("3.update Student");
			System.out.println("4.remove Student");
			System.out.println("5.fetchall");
			System.out.println("6.exit");
			switch (sc.nextInt()) {
			case 1:
			{
				Student f=new Student();
				System.out.println("enter student name");
				f.setName(sc.next());
				System.out.println("enter age");
				f.setAge(sc.nextInt());
				System.out.println("enter address");
				f.setAddress(sc.next());
				
				System.out.println("enter image path");
				Scanner sc2 = new Scanner(System.in);
				FileInputStream fs = new FileInputStream(sc2.nextLine());
				byte[] arr = new byte[fs.available()];
				fs.read(arr);
				f.setImage(arr);
				s.addStudent(f);
				
				
				
			}
			
				break;
				
			case 2:
			{
				System.out.println("enter id");
				s.fetchStudent(sc.nextInt());
			}
			break;
			case 3:
			{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name ");
				s.updateStudent(id,(sc.next()));
			}
			break;
			case 4:
			{
				System.out.println("enter id");
				s.removeStudent(sc.nextInt());
			}
			break;
			case 5:
			{
				s.fetchAll();
			}
			case 6:
			{
				flag= false;
				System.out.println("thank you");
			}

			default:
				break;
			}
		}
	}

}
