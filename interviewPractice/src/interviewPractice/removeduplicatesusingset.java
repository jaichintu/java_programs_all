package interviewPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatesusingset {
	public static void main(String[] args) {
		int [] arr={1,1,2,2,4,4,3,5,5,3};
		LinkedHashSet<Integer> s= new LinkedHashSet<Integer>();
//		int index=0;
		
//		int [] a=new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			s.add(arr[i]);
		}
		
		System.out.println(s);
	}

}
