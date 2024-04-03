package newlogicsclass;
import java.util.Arrays;
public class Bubblesort {
	
	public static void main(String[] args) {
		
		int[] arr={4,1,3,5,2};
		
		for(int i=0; i<arr.length; i++) 
		{
			
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
//		System.out.println(Arrays.toString(arr));
		
//		for(int a:arr)
//		{
//			System.out.print(a[0]+" "+a[arr.length-1]);
//		}
		for(int i=0; i<arr.length; i++)
		{	
			
		}
		System.out.println(arr[0]+" "+arr[arr.length-1]);
		
		}
}
