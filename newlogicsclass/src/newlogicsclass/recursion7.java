package newlogicsclass;

public class recursion7 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(fib(i));
		}
	}
	
	static int fib(int no)
	{
		if(no==0){
		return no;
		
		}else if(no==1 || no==2){
			return 1;
		}
		
		else
			return fib(no-1) + fib(no-2);
	}
}
