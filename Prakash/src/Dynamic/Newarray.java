package Dynamic;

public class Newarray {
	public static void main(String[] args){
	String[]  arr = {"AwwA","Java","kataka","MALAYALAM","space","ANNA"};
	for(int i=0; i<arr.length; i++)
	{
		String str=arr[i];
		String reverse="";
		for(int j=str.length()-1; j>=0;j--){
			reverse = reverse + str.charAt(j);
		}
		if(str.equals(reverse))
		{
			System.out.println(str+ " is a palindrome");
		}
		else{
			System.out.println(str+ " is not a palindrome");
		}
			
      }
	}
}
	
