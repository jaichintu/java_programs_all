package formocks;



public class ooo {
	
	static int all(int arr)
	{
		int sum=0;
		while(arr!=0)
		{
			int rem=arr%10;
			sum=sum+(rem*rem);
			arr=arr/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int [] arr={20,23,41,21};
		for(int i=0; i<arr.length; i++)
		{
			while(arr[i]>9)
			{
				arr[i]=all(arr[i]);
			}
			if(arr[i]==1 ||  arr[i]==7)
			{
				System.out.println("happy number");
			}
			else{
				System.out.println("not a happy number");
			}
		}
	}

}
