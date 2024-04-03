package newlogicsclass;

public class mmmm {
	public static void main(String[] args) {
		String str="KNOWLEDGE";
		
		String s1=str.substring(0,4);
		String s2=str.substring(4);
		
		System.out.println(s1 + " " + s2 );
		String reverse="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			reverse=reverse+s1.charAt(i);
			System.out.println(reverse);
		}
		System.out.println(s2+""+reverse);
		
		
	}

}
