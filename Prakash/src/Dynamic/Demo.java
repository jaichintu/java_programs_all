package Dynamic;

public class Demo {
	public static void main(String[] args)
	{
		sub(10,5);
	}
	static void sub(int x,int y)
	{
		int res=x-y;
		System.out.println(res);
		add(res);
		
	}
	static void add(int a)
	{
		int b=a+a;
		System.out.println(b);
		
		
	}

}
