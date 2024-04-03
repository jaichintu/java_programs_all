package cls;

public class Queue {
	
	int[] arr;
	int beginningofqueue;
	int topofqueue;
	
	public Queue(int size){
		arr=new int[size];
		
		beginningofqueue=-1;
		topofqueue=-1;
	}
	
	public boolean isfull()
	{
		if(topofqueue==arr.length-1)
		{
			return true;
			
		}
		else{
			return false;
		}
	}

}
