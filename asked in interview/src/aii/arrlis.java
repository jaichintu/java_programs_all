package aii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrlis {
	public static void main(String args []) {
		List<Integer> p1 =new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5));
		
		duplicateremove(p1);
		
		for(Integer a:p1)
		{
			System.out.println(a);
		}
	}

	public static void duplicateremove(List<Integer> p1) {
		
		for(int i=p1.size()-1; i>=0; i--)
		{
			Integer s=p1.get(i);
			
			for(int j=i-1; j>=0; j--)
			{
				if(s.equals(p1.get(j)))
				{
					p1.remove(j);
					
				}
			}

		}
		
		
	}

}
