package onlypatterns;

public class mirrorofrightangle {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1; i<=n; i++) // for rows only
		{
			for(int j=n-1; j>=i; j--) // for printing empty spaces
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) // for printing stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
