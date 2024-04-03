package HackerRank;

import java.util.Scanner;

public class inputarrayscanner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array size");
		
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		System.out.println("enter array values");
		
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the values of array are");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
