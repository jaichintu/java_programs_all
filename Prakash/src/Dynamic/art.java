package Dynamic;

public class art
{
double area(int r)
{
final double pi=3.142;
double a=pi*r*r;


return a;

}
public static void main(String[] args)
{
art a1=new art();
double x=a1.area(10);
System.out.println(x);

}
}
