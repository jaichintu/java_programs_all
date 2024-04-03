package newlogicsclass;
/**/

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {

		anagram a = new anagram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String string1 = scanner.next();
		System.out.println("Enter second String: ");
		String string2 = scanner.next();

		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		
		if(string1.length() == string2.length()){
			ch1 = sort(ch1,string1);
			ch2 = sort(ch2,string1);
		}else{
			System.out.println("Not Palindrome!");
		}
		for(char c: ch1){
			System.out.print(c);
		}
		for(char c: ch2){
			System.out.print(c);
		}
	}

	static char[] sort(char[] ch,String string1) {
		
		int i = 0, j = string1.length() - 1;

		while (i <= j) {
			if (ch[i] > ch[i + 1]) {
				char temp;
				temp = ch[i];
				ch[i] = ch[i + 1];
				ch[i + 1] = temp;
				i++;
			}
		}
		return ch;
	}

}
