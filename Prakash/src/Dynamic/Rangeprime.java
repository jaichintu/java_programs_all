package Dynamic;

public class Rangeprime {
	public static void main(String[] args) {

		for(int j=3; j<=100; j++)
		{
			int no=j;
			boolean flag = true;
			for(int i=2; i<no; i++)
			{
				if(no % i==0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				System.out.println(no+ " prime number");
			}
		}
	}
}
