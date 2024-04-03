package HackerRank;

import java.util.Arrays;

public class fetch {
	
	public static void main(String[] args) {
		
		int [] arr={1,0,2,0,3,0,4,0,5,0,6};
		
		for(int i=0; i<arr.length; i++)
		{
			
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]==0)
				{
					int temp=arr[j];
					
					arr[j]=arr[j+1];
					
					arr[j+1]=temp;
					
				}
			}
		}
//		System.out.println(Arrays.toString(arr));
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
