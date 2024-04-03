package Dynamic;
import java.util.Scanner;
public class Sample {
	
	static String all(String str)
	{
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=sc.nextLine();
		str=all(str);
		System.out.println(str);
	}

}
