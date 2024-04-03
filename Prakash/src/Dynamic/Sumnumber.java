package Dynamic;

import java.util.Scanner;

public class Sumnumber {
	
	static int all(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int no=sc.nextInt();
		while(no>9)
		{
			no=all(no);
		}
		
		System.out.println(no);
	}

}