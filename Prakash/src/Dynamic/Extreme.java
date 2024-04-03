package Dynamic;

public class Extreme {
	public static void main(String[] args)
	{
		int[] arr = {73837,5439,1735,86768,9134,9731379,32123,89798};
		for (int i = 0; i < arr.length; i++) {
			pallindrome(arr[i]);
			
		}
		
	}
	static void pallindrome(int no)
	{
	    int copy=no;
	    int reverse=0;
	    while(no!=0){
	    	int rem=no%10;
	    	reverse=(reverse*10)+rem;
	    	no=no/10;
	    }
	    	if(copy==reverse)
	    	{
	    		System.out.println( copy+ " is a pallindrome");
	    		while(copy > 9){
	    			copy = happynum(copy);
	    			if(copy==1 || copy==7)
	    			{
	    				System.out.println(copy + " is happy number");
	    			}
	    			else{
	    				System.out.println(copy + " is not a happy number");
	    			}
	    			System.out.println("*****************************************************");
	    		}
	    	}
	    	else{
	    		System.out.println(copy+ " not a pallindrome");
	    		while(copy > 9){
	    			copy = single(copy);
	    		}
	    		fact(copy);
	    		System.out.println("********************************************************");
	    	}
	    }
	
	static int happynum(int no)
	{
		int sum = 0;
		while(no!=0)
		{
			int rem = no%10;
			sum = sum + rem;
			no = no/10;
		}
		return sum;
	}
	static int single(int no)
	{
		int sum=0;
		while(no!=0){
			int rem = no%10;
			sum = sum + rem;
			no = no/10;
		}
		return sum;
	}
	static void fact(int no)
	{
		int fact=1;
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +no+ " is " +fact);
	}

}
