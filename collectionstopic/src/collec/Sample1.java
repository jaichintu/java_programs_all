package collec;

import java.util.ArrayList;

public class Sample1 {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(89);
		a.add("ok");
		a.add('a');
		System.out.println(a.contains(89));
		System.out.println(a.get(2));
		System.out.println(a.size());
		a.remove(0);
		System.out.println("*******after removing**********");
		System.out.println(a);
		
	}
}
