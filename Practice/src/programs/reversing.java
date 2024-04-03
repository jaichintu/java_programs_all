package programs;
public class reversing {


static void num(String str)
{


for(int i = 0; i<str.length()-1; i++)
{
	char ch1=str.charAt(0);
	char ch2=str.charAt(1);
	char ch3=str.charAt(2);
	char ch4=str.charAt(3);
	char ch5=str.charAt(4);
	char ch6=str.charAt(5);
	char ch7=str.charAt(6);
	char ch8=str.charAt(7);
	char ch9=str.charAt(8);
	char ch10=str.charAt(9);
	char ch11=str.charAt(10);
	char ch12=str.charAt(11);
	
	System.out.print(ch1+" "+ch2+""+ch3+""+ch4+""+ch5+""+ch6+""+ch7+""+ch8+""+ch9+""+ch10+""+ch12 );
	break;
}

 
}

	public static void main(String[] args) {
				String e="i love india";
				String rev="";
				for(int i=e.length()-1; i>=0; i--)
				{
					rev=rev+e.charAt(i);
				}
				num(rev);
				
				
			}
	}

