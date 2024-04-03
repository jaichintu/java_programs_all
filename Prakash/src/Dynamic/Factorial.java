package Dynamic;

import java.util.Scanner;

public class Factorial {
	
	static int all(int no)
	{
		int fact=1;
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int no=sc.nextInt();
		no=all(no);
		System.out.println(no);
	}

}
