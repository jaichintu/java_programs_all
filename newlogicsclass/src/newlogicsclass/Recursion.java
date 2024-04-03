package newlogicsclass;

public class Recursion {
	
	public static void main(String[] args) {
		int no=10;
		all(no);
	}

	 static void all(int no) {
		 
		 if(no>=1)
		 {
			 if(no%2==0){
			 System.out.println(no);
			 }
			 
			 all(no-1);
		 }
		
		
	}
	

}
