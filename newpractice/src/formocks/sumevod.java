package formocks;

public class sumevod {
public static void main(String[] args) {
	int no=1234567;
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		if(rem%2==0)
		{
		sum=sum+rem;
		}
		no=no/10;
	}
}
}
