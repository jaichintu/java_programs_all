package newlogicsclass;

import java.util.HashMap;
import java.util.Map;

public class frequencymap2 {
	
	public static void main(String[] args) {
		String [] ch={"apple","banana","apple","mango","apple","mango"};
		Map<String, Integer> m1=new HashMap<String, Integer>();
		
		for(String c:ch)
		{
			if(!m1.containsKey(c))
			{
				m1.put(c, 1);
			}
			else{
				m1.put(c, m1.get(c)+1);
			}
		}
//		System.out.println(m1);
		for(Map.Entry<String, Integer> print:m1.entrySet())
		{
			System.out.println(print.getKey()+"->"+print.getValue());
		}
	}
																																													
	
}


