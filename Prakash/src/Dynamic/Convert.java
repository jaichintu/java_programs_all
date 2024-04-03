package Dynamic;

public class Convert {
	public static void main(String[] args) {
		String str="hello";
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			ch = (char) (ch-32);
			System.out.println(ch);
		}
	}

}
