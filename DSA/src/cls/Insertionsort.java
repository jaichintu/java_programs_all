package cls;

public class Insertionsort {
	public static void main(String[] args) {
		int [] arr={3,6,8,9,2,4};
		
		for(int i=1; i<arr.length; i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		} 
		
		for(int a:arr)
		{
			System.out.print(a + " ");
		}
	}

}
