package newlogicsclass;

import java.util.HashMap;
import java.util.Map;

public class frequencyusingmap {
	public static void main(String[] args) {
		String str="java";
		char[] ch=str.toCharArray();
		Map<Character, Integer> m1=new HashMap<Character, Integer>();
		
		for(char c:ch)
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
		for(Map.Entry<Character, Integer> print:m1.entrySet())
		{
			System.out.println(print.getKey()+"->"+print.getValue());
		}
	}
																																													
	
}
