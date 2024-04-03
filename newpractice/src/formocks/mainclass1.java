package formocks;
class Demo extends Thread
{
	public void run()
	{
		System.out.println("hi");
	}
}
class Sample extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
}

public class mainclass1 {
public static void main(String[] args) {
	Demo d1=new Demo();
	Thread th1=new Thread(d1);
	th1.start();
	Sample s1=new Sample();
	Thread th2=new Thread(s1);
	th2.start();
}
}
