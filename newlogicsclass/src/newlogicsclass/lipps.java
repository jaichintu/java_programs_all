package newlogicsclass;

public class lipps {
	public static void main(String[] args) {
		String str="hello";
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			int no =(int) ch;
			ch= (char) (no+4);
			System.out.print(ch);
		}
	}

}
