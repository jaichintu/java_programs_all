package Dynamic;

import java.util.Scanner;

public class Happy {
	
	static int all(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
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
		if(no==1 || no==7)
		{
			System.out.println("happy number");
		}
		else{
			System.out.println("not a happy number");
		}
		
		System.out.println(no);
	}

}
