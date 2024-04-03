package newlogicsclass;

import java.util.Arrays;

public class newlogic1 {
	public static void main(String[] args) {
		int[] arr1={1,0,3,0,5,0,2};
		int[] arr2={4,6,7,0,0,0};
		int j=0;
		
		for(int i=0; i<arr1.length; i++) // i=0 0<7 
		{
			if(arr1[i]==0)
			{
				arr1[i]=arr2[j++];
				
			}
			
			
		}
		
		Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
	}

}
