package interviewPractice;

public class duplicates {
	public static void main(String[] args) {
		int [] arr={1,1,2,3,4,4,5,6,6};
		for(int i=0; i<arr.length; i++)
		{
			int answer=0;
			for(int j=0; j<arr.length; j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					answer++;
					break;
				}
			}
			if(answer==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
