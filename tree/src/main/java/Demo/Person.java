package Demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private String Name;
	private int age;
	private Long phoneNo;
	
	@OneToOne
	private Aadhaar a;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Aadhaar getA() {
		return a;
	}

	public void setA(Aadhaar a) {
		this.a = a;
	}
	
}
