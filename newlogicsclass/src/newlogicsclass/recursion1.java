package newlogicsclass;

public class recursion1 {
	public static void main(String[] args) {
		int no = 5;
		System.out.println(all(no));
		
	}

		static int all(int no) {
			
			if(no==0)
			{
				return no;
			}
			else{
				return no + all(no-1);
			}
		
		
	}

}
