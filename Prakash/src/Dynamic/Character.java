package Dynamic;

public class Character {
	public static void main(String[] args) {
		String[] arr={"ankara","adelaide","atlanta","abudhabi","varanasi"};
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String str = arr[i];
			for(int j = 0; j< str.length(); j++)
			{
				char ch=str.charAt(j);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
