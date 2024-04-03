package formocks;

public class single {
	
	static int test(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}
	
public static void main(String[] args) {
	int no=123;
	while(no>9)
	{
		no=test(no);
		
	}
	System.out.println(no);
}

}
