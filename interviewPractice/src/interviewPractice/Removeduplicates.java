package interviewPractice;

public class Removeduplicates {
	public static void main(String[] args) {
		int [] arr={1,1,2,2,3,3,4,5,8,7,6,6,9,9};
		int n=arr.length;
		int j=0;
		j=removeduplicates(arr,n);
		
		for(int i=0; i<j; i++)
		{
			System.out.println(arr[i] + " ");
		}
	}

	public static int removeduplicates(int[] arr, int n) {
		if(n==0 || n==1)
		{
			return n;
		}
		
		
		int j=0;
		
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[n-1];
		
		return j;
	}

}
