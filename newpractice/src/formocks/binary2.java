package formocks;

public class binary2 {
	
	static String test(String str)
	{
		int no=4;
		while(no!=0)
		{
			int rem=no%2;
			str=rem+str;
			no=no/2;
		}
		return str;
	}
	public static void main(String[] args) {
		
		String x = test("");
		System.out.println(x);
	}

}
