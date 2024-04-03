package Dynamic;

import java.util.Scanner;

public class fibnocci {
	public static void main(String[] args) {
		double fib1=0;
		double fib2=1;
		double fib3=0;
		System.out.println(fib1);
		System.out.println(fib2);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the range");
		
		double no = sc.nextDouble();
		
		for(int i=2; i<=no; i++)
		{
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;
		}
	}

}
