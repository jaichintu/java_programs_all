package newlogicsclass;

public class lrev {
	
		
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
			int [] arr={7896,8923,5432,9183,8135};
			for (int i = 0; i < arr.length; i++) {
				int rem=0;
				int co=0;
				while(arr[i] !=0)
				{
					rem = arr[i] % 100;
					co=arr[i] / 100;
					rem=rev(rem);
					arr[i] *=0;
				}
				System.out.println(co + "" + rem + " ");
				
			}
		}
	}



