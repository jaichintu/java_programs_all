package newlogicsclass;

public class revarr {
	
	static int rev(int no)
	{
		int rev=0;
		while(no!=0)
		{
			int rem = no % 10;
			rev = rev*10+rem;
			no=no/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int [] arr={798,876,654,438,853};
		for (int i = 0; i < arr.length; i++) {
			int rem=0;
			int co=0;
			while(arr[i] !=0)
			{
				rem = arr[i] % 10;
				co=arr[i] / 10;
				co=rev(co);
				arr[i] *=0;
			}
			System.out.println(co + "" + rem + " ");
			
		}
	}
}
