package parvendra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Markscard {
	
	@Id
	private String degree;
	private double percentage;
	
	@ManyToOne
	
	Student s;
	

}
