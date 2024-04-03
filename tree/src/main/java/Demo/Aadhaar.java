package Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhaar {
	
	@Id
	private long aNo;
	private String address;
	public long getaNo() {
		return aNo;
	}
	public void setaNo(long aNo) {
		this.aNo = aNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
