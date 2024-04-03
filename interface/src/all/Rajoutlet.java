package all;

interface Nike
{
	void shoes();
}
interface Puma extends Nike
{
	void bags();
}
public class Rajoutlet {
	public void shoes()
	{
		System.out.println("jingalala shoes");
	}
	public void bags()
	{
		System.out.println("jingalala bags");
	}
	public static void main(String[] args) {
		Rajoutlet r1 = new Rajoutlet();
		r1.bags();
		r1.shoes();
	}

}
