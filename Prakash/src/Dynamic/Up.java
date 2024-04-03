package Dynamic;

 class Mm {
	
	int x = 10;
}
class Ppp extends Mm
{
   void test()
   {
	   System.out.println("hello");
   }
}
public class Up
{
public static void main(String[] args)
{
Mm s1 = new Ppp();
System.out.println(s1.x);

Ppp d1 = (Ppp) s1;
System.out.println(d1.x);
d1.test();
}
}


