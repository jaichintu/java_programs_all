package practice;

class CanaraBank{
	private  int atmpin = 1234;

	public int getAtmpin() {
		return atmpin;
	}

	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}
	
}









public class Customer {
	public static void main(String[] args) {
		CanaraBank atmcard = new CanaraBank();
		System.out.println(atmcard.getAtmpin());
		atmcard.setAtmpin(4455);
		System.out.println(atmcard.getAtmpin());
	}

}
