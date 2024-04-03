package formocks;
interface Sample1
{
	int x=10;
}
interface Demo1
{
	void disp();
}
class cool1 implements Sample1,Demo1
{
  public void disp()
  {
	  System.out.println("hello iam achieved");
  }
}

public class tester {
	public static void main(String[] args) {
		cool1 c1=new cool1();
		c1.disp();
		System.out.println(c1.x);
	}

}
