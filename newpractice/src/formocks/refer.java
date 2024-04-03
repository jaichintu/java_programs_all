package formocks;

public class refer {
	int x=90;
	static void usa(refer r2)
	{
		System.out.println(r2.x);
	}
	public static void main(String[] args) {
		refer r1=new refer();
		System.out.println(r1.x);
		usa(r1);
	}

}
