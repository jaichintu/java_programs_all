package newlogicsclass;

public class adjacentwords {
	
	public static void main(String[] args) {
		String str="hey hey hi hi hi how how how";
		
		String [] s1=str.split(" ");
		
		for(int i=0; i<s1.length-1; i++)
		{
			if(!remove(s1[i],s1[i+1]))
			{
				System.out.println(s1[i]);
			}
		}
		
	}
	static boolean remove(String s1,String s2)
	{
	if(s1.length()!=s2.length())
	{
		return false;
	}
	
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)!=s2.charAt(i))
		{
			return false;
		}
	}
	
	return true;
	
	}

	

}
