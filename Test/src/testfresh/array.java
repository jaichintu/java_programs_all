package testfresh;

public class array {
	static void sumeven(int [] arr)
	{
		int evensum=0;
		int oddsum=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0)
			{
				evensum=evensum+arr[i];
			}
			else{
				oddsum=oddsum+arr[i];
			}
			
			System.out.print(evensum);
			System.out.println(oddsum);
		}
	}
	static void sumofsquareofeachdigit(int [] arr)
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+(arr[i]*arr[i]);
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5};
		sumeven(arr);
		sumofsquareofeachdigit(arr);
	}

}
