package formocks;

public class encap {
	private int atmpin=1234;
	public int getatmpin()
	{
		return atmpin;
	}
	public void setatmpin(int atmpin)
	{
		this.atmpin=atmpin;
	}
	
	public static void main(String[] args) {
		encap e1=new encap();
		System.out.println(e1.getatmpin());
		e1.setatmpin(5566);
		System.out.println(e1.getatmpin());
	}

}
