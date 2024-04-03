package newlogicsclass;

public class rswllfc {
	public static void main(String[] args) {
		String str="java";
		
		char [] ch=str.toCharArray();
		int count=0;
		
		for(char c:ch)
		{
			count++;
			
		}
		
		for(int i=count-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
	}

}
