package newlogicsclass;

public class don {
	
	static String s1="";
	
	public static void main(String[] args) {
		String str="don";
		
		
		
		for(int i=0; i<str.length(); i++)
		{
			print(str.charAt(i));
		}
				
		
		
	}
	
	
	static void print(char ch)
	{
		char c='a';
		
		while(c<=ch)
		{
			System.out.println(s1+""+c);
			c=(char)(c+1);
		}
		s1=s1+ch;
		
	}

}
