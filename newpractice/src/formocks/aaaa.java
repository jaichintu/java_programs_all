package formocks;

public class aaaa {
	public static void main(String[] args) {
		int[] arr={123,121,131,143};
		
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0){
		
			palindrome(arr[i]);
			}
		}
	}
	static void palindrome(int arr)
	{
		int copy=arr;
		int rev=0;
		while(arr!=0)
		{
			int rem=arr%10;
			rev=(rev*10)+rem;
			arr=arr/10;
		}
		System.out.println(rev);
	}

}
