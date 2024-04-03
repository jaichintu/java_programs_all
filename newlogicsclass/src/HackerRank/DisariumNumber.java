package HackerRank;

public class DisariumNumber {
	
	public static void main(String[] args) {
		
		int no=135;
		
		int sum=0;
		int n=no;
		
		int len=calculatelength(no);
		
		while(no!=0)
		{
			int rem=no%10;
			
			sum=sum+(int)Math.pow(rem, len);
			
			no=no/10;
			
			len--;
		}
		if(sum==n)
		{
			System.out.println(sum+ " is a disarium number");
		}
		else{
			System.out.println(sum+ " not a disarium number");
		}
		
	}

	public static int calculatelength(int no) {
		int length=0;
		while(no!=0)
		{
			length=length+1;
			no=no/10;
		}
		
		return length;
	}

}
