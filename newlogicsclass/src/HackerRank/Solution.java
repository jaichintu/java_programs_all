package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String [] args) throws IOException
    {
    	
    	System.out.println("enter the size of the array");
    	
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int size=Integer.parseInt(br.readLine());
        
//        System.out.println(size);
        
        System.out.println("enter the array values");
        
        List<Integer> arr=new ArrayList<>();
        
        for(int i=0; i<size; i++)
        {
           int arrq=Integer.parseInt(br.readLine());
           arr.add(arrq);
        }
        List result=reverseArray(arr);
        
        System.out.println(result);
        
//        System.out.println(arr);
    }

    

    public static List<Integer> reverseArray(List<Integer> a) {
        
   	 List<Integer> r=new ArrayList<>();
      for(int i=a.size()-1; i>=0; i--)
      {
    	  
    	 r.add(a.get(i));
      }
     
	return r;

    }

}
