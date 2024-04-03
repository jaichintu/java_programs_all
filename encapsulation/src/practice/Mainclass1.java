package practice;

class Gmail{
	private String pwd="dngdongding";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}






public class Mainclass1 {
	public static void main(String[] args) {
		Gmail g1 = new Gmail();
		System.out.println(g1.getPwd());
		g1.setPwd("hhhh");
		System.out.println(g1.getPwd());
	}

}
