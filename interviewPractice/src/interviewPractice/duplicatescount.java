package interviewPractice;

public class duplicatescount {
public static void main(String[] args) {
	
	int [] arr={1,1,2,2,3,4,5,5,6,6,6,6};
	
	int count=0;
	
	for(int i=0; i<arr.length-1; i++)
	{
//		if(arr[i] != -1)
//		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
//					arr[j]=-1;
					break;
				}
			}
		}
//	}
	System.out.println(count);
		
}
}
