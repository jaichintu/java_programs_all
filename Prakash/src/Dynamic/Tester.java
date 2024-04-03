package Dynamic;

import java.util.Scanner;

public class Tester {
	
	static String all(String str)
	{
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			return("palindrome");
		}
		else{
			return("Not a palindrome");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=sc.nextLine();
		str=all(str);
		System.out.println(str);
	}

}

