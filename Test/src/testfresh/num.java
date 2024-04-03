package testfresh;

public class num {
	public static void main(String[] args) {
		int rev = 0;
		
		int no = 1441;
		int copy = no;
		while(no!=0)
			
		{
			int rem = no % 10;
			rev =(rev*10)+rem;
			no = no/10;
		}
		if(copy==rev)
		{
			System.out.println("pallindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
		
	}

}

