package newlogicsclass;

public class distinctnumber {
	
	public static void main(String[] args) {
		int [] arr={1,2,2,3,4,4,5,6,6,7};
		
		for(int i=0; i<arr.length; i++)
		{
			int answer=0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					answer++;
					break;
				}
			}
			if(answer==0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

}
