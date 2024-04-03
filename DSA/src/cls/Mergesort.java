package cls;

import java.util.Arrays;

public class Mergesort {
	public static void main(String[] args) {
		int [] arr={4,5,1,6,2,3};
		int n=arr.length-1;
		partition(arr,0,n);
		System.out.println(Arrays.toString(arr));
	}

	private static void partition(int[] arr, int left, int right) {
		if(right>left)
		{
			int mid=(left+right)/2;
			partition(arr,left,mid);// LTA
			partition(arr, mid+1, right); // 6,3,3 RTA
			sort(arr,left,right,mid);
		}
		
	}

	private static void sort(int[] arr, int left, int right, int mid) {
		int [] LTA=new int[mid-left+2];// 2-0+2=4
		int [] RTA=new int[right-mid+1];// 5-2+1=4
		for(int i=0; i<=mid-left; i++)
		{
			LTA[i]=arr[left+i];// 
		}
		for(int i=0;i<right-mid; i++)
		{
			RTA[i]=arr[mid+1+i];                      
		}
		LTA[mid-left+1]=Integer.MAX_VALUE;
		RTA[right-mid]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k=left; k<=right; k++)
		{
			if(LTA[i]<RTA[j])
			{
				arr[k]=LTA[i];
				i++;
			}
			else{
				arr[k]=RTA[j];
				j++;
			}
		}
		
		
	}
	

}
