package newlogicsclass;

public class reversestringonlyusingtocharandcondstmt {
	public static void main(String[] args) {
		String str="java";
		String s1="";
		char [] ch=str.toCharArray();
		for(char c:ch)
		{
			s1=c+s1;
		}
		System.out.println(s1);
		
	}

}
