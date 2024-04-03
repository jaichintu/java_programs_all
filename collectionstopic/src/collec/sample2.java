package collec;
import java.util.Vector;

public class sample2 {
	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(25);
		v.add(26);
		v.add(true);
		Vector v2=new Vector(v);
		v2.add("rocky");
		v2.add('a');
		System.out.println(v);
		System.out.println(v2);
		System.out.println(v2.capacity());
		
	}

}
