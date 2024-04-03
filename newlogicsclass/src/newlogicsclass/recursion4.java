package newlogicsclass;

public class recursion4 {
	public static void main(String[] args) {
		int no=6;
		 System.out.println(all(no));
	}

	static int all(int no) {
		if(no==-1)
		{
			
			return no;
			
		}
		else if(no%2==1){
			return no + all(no-2);
		}
		else{
			return all(no-1);
		}
		
	}

}