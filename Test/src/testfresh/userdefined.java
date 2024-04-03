package testfresh;
class main extends Exception{
	public static void main(String[] args) {
		
	
	age();
}

	private static void age() {
		// TODO Auto-generated method stub
		
	}}

public class userdefined {
	
		
	
	public static void age() throws main{
		int age=19;
		if(age>21)
		{
			System.out.println("happymarries");
			
		}else
		{
			throw new main(); 
		}
	}

}
