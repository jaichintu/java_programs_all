package newlogicsclass;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "rac";
		char[] ch = string1.toCharArray();
		int i = 0, j = string1.length() - 1, l = string1.length() - 1;

		while (i <= j) {
			if (i != l) {
				if (ch[i] > ch[i + 1]) {
					char temp;
					temp = ch[i];
					ch[i] = ch[i + 1];
					ch[i + 1] = temp;
					i++;
				}
			}
			
		}
		
		for (int k = 0; k < ch.length; k++) {
			System.out.println(ch);
		}

	}

}
