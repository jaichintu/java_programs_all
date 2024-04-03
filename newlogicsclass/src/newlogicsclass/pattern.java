package newlogicsclass;

public class pattern {
	public static void main(String[] args) {
		int n=7;
		
		char ch='A';
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print((char)(ch +j)+"");
			}
			System.out.println();
		}
	}

}
