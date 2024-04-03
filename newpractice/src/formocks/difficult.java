package formocks;

public class difficult {
	
	
	static void singlesum()
	{
		
	}
	
	static void armstrong(int arr)
	{
		
		int arr1=arr;
		int copy=arr;
		int sum=0;
		int count=0;
		while(arr1!=0)
		{
			arr1=arr1/10;
			count++;
		}
		while(arr!=0)
		{
			int rem=arr%10;
			sum+=Math.pow(rem,count);
			arr=arr/10;
			
		}
		if(sum==copy)
		{
			System.out.println("armstrong number");
		}
		else{
			System.out.println("not a armstrong number");
		}
		
	}	
	public static void main(String[] args) {
		int [] arr={153,1674,370,407,123,421,142};
		for(int i=0; i<arr.length; i++)
		armstrong(arr[i]);
	}

}
