package Dynamic;

public class Practice1 {
	public static void main(String[] args){
		
	
	String[] arr={"Dwaraka","gadag","ayodhya","laval","tippudrop","ziliz"};
	for(int i=0; i<arr.length; i++)
	{
		if(i%2!=0)
		{
			String str= arr[i];
			String rev = "";
			for(int j = str.length()-1; j>=0; j--)
			{
				rev = rev + str.charAt(j);
			}
			if(str.equals(rev))
			{
				System.out.println(rev+ " palindrome");
			}
			else{
				System.out.println(rev+ " not a palindrome");
			}
		}
	}
					
}
}