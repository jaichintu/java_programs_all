package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("enter a number");
		
//		InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		double a= Double.parseDouble(br.readLine());
		
		System.out.println(a);
		
	}

}
