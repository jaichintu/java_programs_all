package newlogicsclass;

public class pattern2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) // for rows
		{
			for(int k=1; k<=n-i; k++) // for space
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) // for columns
			{
				System.out.print(j +  " "); // give space for pyramid ("* ")
			}
			System.out.println();
		}
	}

}