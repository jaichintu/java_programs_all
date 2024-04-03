package newlogicsclass;

public class spwfc {
	
	static boolean compareString(char [] ch)
	{
		int i=0;
		int j=ch.length-1;
		
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}	
	public static void main(String[] args) {
		String str="appa";
		char [] ch=str.toCharArray();
		
		if(compareString(ch))
		{
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}

}
