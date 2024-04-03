package cls;

public class Wmainclass {
	public static void main(String[] args) {
		webhistory w1=new webhistory();
		w1.visitpage("homepage");
		w1.visitpage("page 1");
		w1.visitpage("page 2");
		w1.visitpage("page 3");
//		
		w1.goback();
////		
//		w1.forwardstack();
//		
//		w1.getcurrentpage();
//		
//		w1.delete();
	}

}
