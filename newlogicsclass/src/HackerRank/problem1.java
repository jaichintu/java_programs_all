package HackerRank;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int z=s.nextInt();
		for (int i = 0; i < z; i++) {
			
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int n=1;
		int sum=0;
		for (int j=0; j<c; j++) {
			sum=sum+b*n;
			System.out.print(a+sum+" ");
			n=n*2;
		}
		System.out.println();
		}
	}

}
