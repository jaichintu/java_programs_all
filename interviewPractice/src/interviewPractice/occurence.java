package interviewPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class occurence {
public static void main(String[] args) {
	
	String str="Developers";
	
	System.out.println(str.length());
	
	char [] ch=str.toCharArray();
	
	Map<Character, Integer> m=new LinkedHashMap<>();
	for(int i=0; i<ch.length; i++)
	{
		if(!m.containsKey(ch[i])){
		m.put(ch[i], 1);
		}
		else{
			int x=m.get(ch[i]);
			x++;
			m.put(ch[i], x);
			
		}
	}
	System.out.println(m);
	
}
}
