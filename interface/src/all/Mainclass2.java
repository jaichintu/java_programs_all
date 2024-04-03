package all;

interface Sample2
{
	void fo();
	void cool();
}

abstract class Demo2 implements Sample2
{
  public void cool()
{
	System.out.println("HIIIII");
}
}
class Tester2 extends Demo2
{
	public void fo()
	{
		System.out.println("iam cool");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Tester2 t2 = new Tester2();
		t2.fo();
		t2.cool();
	}

}

