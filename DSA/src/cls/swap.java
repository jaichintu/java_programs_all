package cls;

public class swap {
	public static void main(String[] args) {
		String str="hellojava";
		
//		char fstr=str.charAt(0);
//		
//		char lstr=str.charAt(str.length()-1);
//		
//		 str=lstr+str.substring(1, str.length()-1)+fstr;
//		
//		System.out.println(str);
		
		String s1=str.substring(0,5);
		String s2=str.substring(5);
		String reverse="";
		
		for(int i=s2.length()-1; i>=0; i--)
		{
			reverse=reverse+s2.charAt(i);
		}
		System.out.println(s1+""+reverse);
		
	}

}
