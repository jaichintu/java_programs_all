package testfresh;

public class newarray {
	static void sumtillsingledigit(int [] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0 && arr[i]<=9)
			{
				sum=sum+arr[i];
			}
			System.out.println(sum);
		}
	}
	static void sumofsquare(int [] arr)
	{
		int sqsum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0 && arr[i]<=9)
			{
				sqsum=sqsum+(arr[i]*arr[i]);
			}
			System.out.println(sqsum);
			
		}
	}
	static void sumofdouble(int [] arr)
	{
		int dsum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>9)
			{
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		int [] arr ={13,2,32,4,5};
		sumtillsingledigit(arr);
		sumofsquare(arr);
	}

}
