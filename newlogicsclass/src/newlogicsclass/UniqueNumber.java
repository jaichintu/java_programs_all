package newlogicsclass;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,3,4,5,5,6};
		
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (i!=j && arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
			if(flag==true) {
				System.out.println(arr[i]+" ");
			}
		}
		
		
	}

}
