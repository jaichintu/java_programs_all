package newlogicsclass;

public class stringreverseusingrecursion {
	public static void main(String[] args) {
		String str="java";
		char [] ch=str.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		reverse(ch,count-1);
	}

	 static void reverse(char[] ch, int size) {
		if(size>=0)
		{
			System.out.print(ch[size]);
			reverse(ch,size-1);
		}
		
	}

}
