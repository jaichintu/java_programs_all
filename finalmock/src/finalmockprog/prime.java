package finalmockprog;

public class prime {
	public static void main(String[] args) {
		int no=4;
		boolean flag=true;
		for(int i=2; i<no;i++)
		{
			if(no%i==0)
			{
				 flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println(" prime number");
		}
		else{
			System.out.println("not a prime number");
		}
	}

}
