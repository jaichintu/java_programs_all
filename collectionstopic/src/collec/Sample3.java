package collec;

import java.util.LinkedList;

public class Sample3 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(25);
		l.add(16.25);
		l.add("dboss");
		System.out.println(l.poll());
		System.out.println(l);
	}

}
