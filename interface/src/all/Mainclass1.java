package all;

interface Sample1{
	void cool();
	void disp();
}
class Demo1 implements Sample1
{
	public void cool()
	{
		System.out.println("I am cool");
	}
	public void disp()
	{
		System.out.println("hello");
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		d1.cool();
		d1.disp();
	}

}
