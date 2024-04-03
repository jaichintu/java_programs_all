package HackerRank;

import org.json.JSONObject;

public class json {
	
	public static void main(String[] args) {
		
		JSONObject json1=new JSONObject();
		
		
		json1.put("name", "allen");
		json1.put("num", "14");
		
		System.out.println(json1);
		
		String str=json1.toString();
		
		System.out.println(str);
		System.out.println(str.length());
		String[] arr=new String[2];
		String key="";
		String value="";
		String sub="";
		int j=0;
		for(int i=2;i<str.length()-2;i++){
			if(str.charAt(i)==','){
//				System.out.println(sub);
				arr[j]=sub;
				j++;
				sub="";
			}else{
				sub+=str.charAt(i);
			}
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}
