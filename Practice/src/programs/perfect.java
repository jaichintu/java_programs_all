package programs;

public class perfect {
	public static void main(String[] args) {
		int no=6;
		int sum=0;
		for(int i=1; i<=no/2; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
				System.out.println(sum);
			}
		}
		System.out.println(sum);
		
		if(no==sum)
		{
			System.out.println(no+ " perfect number");
		}
		else{
			System.out.println(no+ " not a perfect number");
		}
	}
}
