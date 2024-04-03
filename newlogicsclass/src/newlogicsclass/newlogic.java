package newlogicsclass;

public class newlogic {
	public static void main(String[] args) {
		int [] arr={1,2,3,5,6,8,9};
		
		int key=12;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]+arr[j]==key)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = ");
					System.out.println(arr[i]+arr[j]);
				}
			}
		}
	}
}
