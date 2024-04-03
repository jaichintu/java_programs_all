package cls;

import java.util.Stack;

public class webhistory {
	public Stack<String> backwardstack;
	public Stack<String> forwardstack;
	public String currentpage;
	
	public webhistory()
	{
		this.backwardstack=new Stack<>();
		this.forwardstack=new Stack<>();
		this.currentpage="homepage";
	}
	public void visitpage(String page)
	{
		backwardstack.push(currentpage);
		forwardstack.clear();
		currentpage=page;
		System.out.println("you have visited " +currentpage);
	}
	
	public void goback()
	{
		if(backwardstack.isEmpty())
		{
			forwardstack.push(currentpage);
			currentpage=backwardstack.pop();
			System.out.println("went back to the page " +currentpage);
		}
		else{
			System.out.println("cannot go back forward");
		}
	}
	public void forwardstack()
	{
		if(!forwardstack.isEmpty())
		{
			backwardstack.push(currentpage);
			currentpage=forwardstack.pop();
			System.out.println("went to forwardstack " +currentpage);
			
		}
		else{
			System.out.println("cannot go forward");
		}
	}
	public String getcurrentpage()
	{
		return currentpage;
	}
	public void delete()
	{
		backwardstack=null;
		forwardstack=null;
	}

}
