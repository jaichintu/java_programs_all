package cls;

public class swapx2 {
public static void main(String[] args) {
	int i=10;
	int j=20;
	
	i=i^j;
	
	j=i^j;
	
	i=i^j;
	
	System.out.println(i);
	System.out.println(j);
}
}
