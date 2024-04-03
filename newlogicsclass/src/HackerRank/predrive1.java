package HackerRank;

public class predrive1 {
	
	public static void main(String[] args) {
		int no=123;
		int sum=0;
		int copy=no;
		
		while(no!=0)
		{
			int rem=no%10;
			sum=sum*10+rem;
			no=no/10;
			
		}
		
		if(sum==copy)
		{
			System.out.println(sum+ " is a palindrome");
		}
		else
		{
			System.out.println(sum+ " is not a palindrome");
		}
	}

}
