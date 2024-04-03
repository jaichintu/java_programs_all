package formocks;

public class binary {
	public static void main(String[] args) {
		int no=4;
		String str="";
		while(no!=0)
		{
			int rem=no%2;
			str=rem+str;
			no=no/2;
		}
		System.out.println(str);
	}

}
