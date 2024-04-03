

package formocks;

public class arms {
	public static void main(String[] args) {
		int no=153;
		int no1=no;
		int copy=no;
		int sum=0;
		int count=0;
		while(no1!=0)
		{
			no1=no1/10;
			count++;
		}
		while(no!=0)
		{
			int rem=no%10;
			sum+=Math.pow(rem,count);
			no=no/10;
			
		}
		if(sum==copy)
		{
			
		}
		else{
			System.out.println("not a armstrong number");
		}
		
	}
	
}
