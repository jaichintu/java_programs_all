package formocks;

public class arrpri {
	public static void main(String[] args) {
		int [] arr={13,18,19,17,23};
		for(int i=0; i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=2; j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					 flag=false;
					break;
				}
				
			}
			if(flag==true)
			{
				System.out.println(arr[i]+ " prime number");
			}
			else{
				System.out.println(arr[i]+ " not a prime number");
			}
		}
		
	}

}