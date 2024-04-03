package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import dao.Herodao;
import dto.Hero;

public class MainClass {
	public static void main(String[] args) throws IOException {
		Herodao dao = new Herodao();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("------------------------------");
			System.out.println("1.Get Movie Details");
			System.out.println("2.Add Movie Details");
			System.out.println("3.Remove Movie data");
			System.out.println("4.Get All the Movie Details");
			System.out.println("5.Update Release date");
			System.out.println("6.Exit");
			System.out.println("------select valid option-------");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter Movie Id");
				dao.fetchHero(sc.nextInt());
			}
				break;
			case 2: {
				Hero k = new Hero();
				System.out.println("enter hero name");
				k.setHeroName(sc.next());
				System.out.println("enter heroine name");
				k.setHeroineName(sc.next());
				System.out.println("enter director name");
				k.setDirectorName(sc.next());
				System.out.println("enter movie name");
				k.setMovieName(sc.next());
				System.out.println("enter movie budget");
				k.setMovieBudget(sc.nextDouble());
				System.out.println("Enter Release Date");
				Date d = new Date(sc.next());
				k.setReleaseDate(d);
				System.out.println("Enter Image path");
				Scanner sc2 = new Scanner(System.in);
				FileInputStream fs = new FileInputStream(sc2.nextLine());
				byte[] arr = new byte[fs.available()];
				fs.read(arr);
				k.setPhoto(arr);
				dao.addHero(k);

			}
				break;
			case 3: {
				System.out.println("Enter Movie Id");
				dao.removeHero(sc.nextInt());
			}
				break;
			case 4: {
				dao.DisplayAll();
			}
				break;
			case 5: {
				System.out.println("Enter Movie Id");
				int id = sc.nextInt();
				System.out.println("Enter New Release date");
				dao.updateDate(id, new Date(sc.next()));
			}
				break;
			case 6: {
				flag = false;
				System.out.println("Bye Bye Come again--------");
			}
				break;
			default: {
				System.out.println("enter valid option......!");
			}
				break;
			}
		}
	}
}