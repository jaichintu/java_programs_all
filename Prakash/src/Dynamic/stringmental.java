package Dynamic;

public class stringmental {
	public static void main(String[] args)
	{
	String str= "i love india";
	String[] s1= str.split(" ");
	for(int i = 0; i < s1.length; i++)
	{
		
		String str1= s1[i];
		String rev="";
		for(int j = str1.length()-1; j>=0; j--)
		{
			rev = rev + str1.charAt(j);
		}
		System.out.print(rev+ " ");
		
	}
	

	}
	
	
}

