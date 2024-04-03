package newlogicsclass;

public class withoutinbuilta3b2c2d1 {
	
	public static void main(String[] args) {
		String str="a3b2c2d1";
			char[] ch=str.toCharArray();
			for(int i=0; i<ch.length; i++)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					all(ch[i],ch[i+1]);
				}
			}
	}

	 static void all(char c, char d) {
		int no=(int) (d-48);
		for(int i=1; i<=no; i++)
		{
			System.out.print(c);
		}
		
	}

}
