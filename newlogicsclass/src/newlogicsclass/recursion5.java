package newlogicsclass;

public class recursion5 {
   public static void main(String[] args) {
	int no=5;
	System.out.println(fact(no));
}
   
   static int fact(int no)
   {
	   if(no==1)
	   {
		   return no;   
	   }
	   else{
		   return no*fact(no-1);
	   }
   }

}
