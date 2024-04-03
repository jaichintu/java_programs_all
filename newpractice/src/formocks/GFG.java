package formocks;

public class GFG {

	
	static int power(int N, int P)
	{
		int pow = 1;
		for (int i = 1; i <= P; i++)
			pow =pow*N;
		return pow;
	}

	
	public static void main(String[] args)
	{
		int N = 2;
		int P = 9;

	        int x=power(N, P);
	        System.out.println(x);
	}
}
