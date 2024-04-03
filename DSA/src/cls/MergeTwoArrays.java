package cls;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7};
        int n1 = arr1.length;
 
        int arr2[] = {2, 4, 6, 8};
        int n2 = arr2.length;
        
        int arr3[] =new int[n1+n2];
        mergearrays(arr1,arr2,n1,n2,arr3);
        
        for(int i=0; i<arr3.length; i++)
        {
        	System.out.print(arr3[i] + " ");
        }
	}

	public static void mergearrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n1 && arr1[i]!=0)
		{
			arr3[k++]=arr1[i++];
		}
		
		while(j<n2)
		{
			arr3[k++]=arr2[j++];
		}
		
		Arrays.sort(arr3);
		
	}

}
