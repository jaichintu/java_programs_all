package newlogicsclass;

public class test {
public static void main(String[] args) {
	int[] array= {2,3,2,3,2,2,4,2};
//	int[] array= {2,2,3,2,4,2};
	int sum=0;
	for(int i=0;i<array.length;i++) {
		if(array[i]==2) {
			sum=sum+array[i];
		}
	}
	System.out.println(sum);
	
	if(sum==8) {
		System.out.println("true");
	}else
	{
		System.out.println("false");
	}
}
}
