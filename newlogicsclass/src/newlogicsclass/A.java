package newlogicsclass;


@FunctionalInterface
public interface A {
	
	 void show();

}

 class B
{
public static void main(String[] args) {
	
	A obj= () -> System.out.println("hi hello");
	
	obj.show();
	
}	

}
