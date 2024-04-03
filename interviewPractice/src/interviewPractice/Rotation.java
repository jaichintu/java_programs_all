package interviewPractice;

import java.util.Arrays;

public class Rotation {
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8};
		
		int k=4;
		int  n=arr.length;
		int r=0;
		int [] temp=new int[n];
		for(int i=k; i<n; i++)
		{
			temp[r]=arr[i];
			r++;
		}
		for(int i=0; i<k; i++)
		{
			temp[r]=arr[i];
			r++;
		}
		for(int i=0; i<n; i++)
		{
			arr[i]=temp[i];
			System.out.print(arr[i] + " ");
			
		}
		
		
		
	}

}
