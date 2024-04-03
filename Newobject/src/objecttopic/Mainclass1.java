package objecttopic;

class Student
{
	String name;
	int id;
	int fees;
	Student(String name, int id, int fees)
	{
		this.name=name;
		this.id=id;
		this.fees=fees;
	}
	public String toString()
	{
		return this.name+" "+this.id+" "+this.fees;
	}
}

public class Mainclass1 {
	public static void main(String[] args) {
		Student s= new Student("balu",123,30000);
		System.out.println(s);
	}

}
