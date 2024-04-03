package cls;

public class selectionsort {
	public static void main(String[] args) {
		int [] arr={6,5,2,8,9,4,45,36,98};
		int size=arr.length;				
		for(int i=0; i<size-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<size; j++)
			{
				if(arr[minIndex]>arr[j])
				{
					minIndex=j;
				}

			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		for(int a:arr)
		{
			System.out.print(a + " ");
		}

	}

}
