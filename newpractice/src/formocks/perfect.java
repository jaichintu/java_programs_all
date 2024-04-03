package formocks;

public class perfect {
	public static void main(String[] args) {
		int no=56;
		int sum=0;
		for(int i=1; i<=no/2; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(no==sum)
		{
			System.out.println( sum+ " perfect number");
		}
		else
		{
			System.out.println(sum+ " not a perfect number");
		}
	}

}
