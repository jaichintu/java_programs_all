package cls;

public class Stack {
	int [] arr;
	int topofstack;
	public Stack(int size)
	{
		arr=new int[size];
		topofstack=-1;
		System.out.println("the stack is created--> "+size);
	}
	//isEmpty
	public boolean isEmpty()
	{
		if(topofstack==-1)
		{
			return true;
			
		}
		else{
			return false;
		}
	}
	//full
	public boolean isFull()
	{
		if(topofstack==arr.length-1)
		{
			return true;
		}
		else{
			return false;
		}
	}
	//push
	public void push(int value) {
		if(isFull())
		{
			System.out.println("the stack is full");
		}
		else{
			arr[topofstack+1]=value;
			topofstack++;
			System.out.println("stack value successfully inserted--> " +value);
		}


	}
	//pop
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("the stack is Empty");
			return -1;
		}
		else{
			int topstack=arr[topofstack];
			topofstack--;
			return topstack;
		}
	}
	
	//peek
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("the stack is empty");
			return -1;
			
		}
		else{
			return arr[topofstack];
		}
	}
	public void deletestack()
	{
		arr=null;
		System.out.println("the stack is successfully deleted");
	}

}

