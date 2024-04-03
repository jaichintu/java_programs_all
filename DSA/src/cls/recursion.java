package cls;

public class recursion {
	
	public static void main(String[] args) {
		num(1);
	}

	 static void num(int i) {
		if(i<=10)
		{
			System.out.println(i);
			num(i+1);
		}
	
	}

}
