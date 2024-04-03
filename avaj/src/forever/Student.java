package forever;



class Student {
	String name;
	int id;
	double fees;
	Student(String name, int id , double fees)
	{
		this.name=name;
		this.id=id;
		this.fees=fees;
	}
	public boolean equals(Object obj)
	
	{
		Student s2=(Student)obj;
		return this.id==s2.id;
		
	}
	public static void main(String[] args) {
		Student s1=new Student("jjjj",1234,30000.56);
		Student s2=new Student("kkkk",12348,31000.78);
		if(s1.equals(s2))
		{
			System.out.println("it is true");
		}
		else{
			System.out.println("it is not true ");
		}
	}
}