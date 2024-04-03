package cls;

public class singleton {
	public static void main(String[] args) {
		
		abc obj1=abc.getInstance();
		
		
		
	}
	
	

}

class abc
{
	static abc obj=new abc();
	
	private abc()
	{
		System.out.println("hello");
		
	}
	public static abc getInstance()
	{
		return obj;
	}
}
