package cls;

import java.util.Arrays;

public class quicksort {
	
	public static void main(String[] args) {
		int [] arr={4,5,1,3,2};
		int n=arr.length-1;
		quicksort(arr,0,n);
		System.out.println(Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int start, int end) {
		if(start<end)
		{
			int pivot=partition(arr,start,end);
			quicksort(arr, start, pivot-1);
			quicksort(arr,pivot+1,end);
			
//			System.out.println("pivot " +pivot);
//			System.out.println("start " +start);
//			System.out.println("end "+end);
			
			
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		
		int pivot=end;
		int j=start-1;
		for(int i=start; i<=end; i++)
		{
			if(arr[i]<=arr[pivot])
			{
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		return j;
	}

}
