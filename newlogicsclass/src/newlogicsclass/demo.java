package newlogicsclass;

import java.util.Arrays;

public class demo {
public static void main(String[] args) {
	String str="programming";
	String str1="hi how are you";
	
	for(int i=0; i<str.length(); i++)
	{
		System.out.println(str.charAt(i));
		
	}
	System.out.println(str.length());
	
	 char [] ch=str.toCharArray();
	 for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	 System.out.println(Arrays.toString(ch));
	 
	 String[] s1 = str.split("");
	 System.out.println(Arrays.toString(s1));
	 
	 System.out.println(str.replace('m','l'));
}
}
