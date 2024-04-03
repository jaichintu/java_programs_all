package formocks;

class MarriageException extends Exception
{
	String mess;
	public MarriageException(String mess)
	{
		this.mess=mess;
	}
	public String getmess()
	{
		return mess;
	}
}

public class mainclass {
	public static void main(String[] args) {
		try{
			agev();
		}
		catch(MarriageException e)
		{
			System.out.println(e.getmess());
		}
	}
	static void agev() throws MarriageException
	{
		int age = 19;
		if(age>21)
		{
			System.out.println("happy marriage life");
		}
		else{
			throw new MarriageException("Invalid age");
		}
	}

}
