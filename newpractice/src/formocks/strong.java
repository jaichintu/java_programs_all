package formocks;

public class strong {
	public static void main(String[] args) {
		int no=145;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem; i>=1; i--)
			{
				fact = fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.println( sum+ " strong number");
		}
		else{
			System.out.println(sum+ " not a strong number");
		}
	}

}
