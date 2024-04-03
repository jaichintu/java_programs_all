package newlogicsclass;

public class recursion3 {
	public static void main(String[] args) {
		int no=7;
		 System.out.println(all(no));
	}

	static int all(int no) {
		if(no==0)
		{
			
			return no;
			
		}
		else if(no%2==0){
			return no + all(no-2);
		}
		else{
			return all(no-1);
		}
		
	}

}
