package aii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class dupstri {
	public static void main(String[] args) {
		String [] str1={"james","rohan","rakesh","james"};
		String [] str2={"jack","jones","rohan","raju","rakesh"};
		
		Set<String> s=new HashSet<>();
		
		for(String a:str1)
		{
			s.add(a);
		}
		
		for(String b:str2)
		{
			s.add(b);
		}
		int l=s.size();
		String [] str3=new String[l];
		for(int i=0; i<str3.length; i++)
		{
		
			
			
		}
//		System.out.println(s);
	}

}
