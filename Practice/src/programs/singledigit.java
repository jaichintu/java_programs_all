package programs;



public class singledigit {
	
	static int all(int no)
	{
	int sum=0;
	while(no!=0)
	{
		int rem = no % 10;
		sum = sum + rem;
		no = no/10;
	}
	return sum;
	
		
	}
	public static void main(String[] args) {
		int no = 14;
		while(no>9)
		{
			no=all(no);
			
		}
		System.out.println(no);
	}
}
