package Dynamic;

public class Prime1 {
	public static void main(String[] args){
		int[] arr={5,3,6,7};
		
		counterprime(arr);
		Numbers(arr);
		evenposition(arr);
		oddposition(arr);
		}
	static void counterprime(int[] arr){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			boolean flag = prime(arr[i]);
			if(flag == true){
				count++;
			}
		}
		System.out.println("prime number in array is " +count);
	}
	static void Numbers(int[] arr){
		int evencount = 0;
		int oddcount = 0;
		for(int i=0; i < arr.length; i++){
			if (arr[i] % 2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		System.out.println("even count is " +evencount);
		System.out.println("odd count is " +oddcount);
	}
	static void evenposition(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				System.out.println("even number of " +arr[i]+ "th position is " +i);
			}
		}
	}
	static void oddposition(int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 != 0){
				System.out.println("odd number of " +arr[i]+ "th position is " +i);
			}
		}
	}
	static boolean prime(int no){
		boolean flag = true;
		for(int i = 2; i < no; i++){
			if(no % i == 0){
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	}
