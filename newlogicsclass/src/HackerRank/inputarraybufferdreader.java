package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputarraybufferdreader {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter array size");
		
		int size=Integer.parseInt(br.readLine());
		
		int [] arr=new int[size];
		
		System.out.println("enter array values");
		
		for(int i=0; i<size; i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("the array elements are");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
