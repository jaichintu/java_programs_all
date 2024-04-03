package newlogicsclass;



public class distinct {
	public static void main(String[] args) {
		
//		Method 1
		String str="java";
		for(int i=0; i<str.length(); i++)
		{
			boolean flag=true;
			for(int j=0; j<str.length(); j++)
			{
				if (i!=j && str.charAt(i)==str.charAt(j))
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(str.charAt(i));
			}
		}
		
		
//		Method 2
//		String str="hello";
//		char[]ch=str.toCharArray();
//		
//		for(int i=0; i<ch.length; i++)
//		{
//			boolean flag=true;
//			for(int j=0; j<ch.length; j++)
//			{
//				if (i!=j && ch[i]==ch[j])
//				{
//					flag=false;
//					break;
//				}
//			}
//			if(flag)
//			{
//				System.out.println(ch[i]);
//			}
//		}
		
		
		
//		Method 3
//		String str="hello";
//		
//		char[]ch=new char[str.length()];
//		
//
//		for (int i = 0; i < ch.length; i++) {
//			ch[i]=str.charAt(i);
//		}
//		
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
//		
//		for(int i=0; i<ch.length; i++)
//		{
//			boolean flag=true;
//			for(int j=0; j<ch.length; j++)
//			{
//				if (i!=j && ch[i]==ch[j])
//				{
//					flag=false;
//					break;
//				}
//			}
//			if(flag)
//			{
//				System.out.println(ch[i]);
//			}
//		}
		
		
//		Method 4
//		String str="hello";
//		String[]ch=str.split("");
//	
//	for(int i=0; i<ch.length; i++)
//	{
//		boolean flag=true;
//		for(int j=0; j<ch.length; j++)
//		{
//			if (i!=j && ch[i]==ch[j])
//			{
//				flag=false;
//				break;
//			}
//		}
//		if(flag)
//		{
//			System.out.println(ch[i]);
//		}
//	}
//	
//	
//	
//	}
}
}
