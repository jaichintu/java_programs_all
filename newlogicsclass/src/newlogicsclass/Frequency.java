package newlogicsclass;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scanner.next();
		int[] arr = new int[122];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			arr[c]++;
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+"->" +arr[i]);
			}
		}
	}
}
