package parvendra;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	private String name;
	private int age;

}
