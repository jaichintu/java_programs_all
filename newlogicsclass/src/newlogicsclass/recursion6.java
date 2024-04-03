package newlogicsclass;

public class recursion6 {
	public static void main(String[] args) {
		int no=10;
		System.out.println(fib(no));
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
