package interviewPractice;

public class constructorcar {
	String engine;
	String transmission;
	String tyres;
	String brakes;
	
	public constructorcar(String engine,String transmission,String tyres,String brakes){
		this.engine=engine;
		this.transmission=transmission;
		this.tyres=tyres;
		this.brakes=brakes;
	}
	
	
	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}


	public String getTyres() {
		return tyres;
	}


	public void setTyres(String tyres) {
		this.tyres = tyres;
	}


	public String getBrakes() {
		return brakes;
	}


	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}


	public void engine(){
		System.out.println("engine is started");
	}
	public void transmission()
	{
		System.out.println("power is transmitted");
	}
	public void tyres(){
		System.out.println("tyres are running");
	}
	public void brakes(){
		System.out.println("brakes are applied");
	}
	
	public static void main(String[] args) {
		constructorcar c1=new constructorcar("v8","manual","allseasoned","disc");
		c1.engine();
		c1.transmission();
		c1.tyres();
		c1.brakes();
	}
	
}
