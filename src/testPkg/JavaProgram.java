package testPkg;

public class JavaProgram 
{

	int a  =100;
	
	int b = 500;
	
	public void printVar()
	{
		
		System.out.println(a);
		System.out.println("this a is a number");
		
		System.out.println(10+20);
		
		System.out.println(a+30);
		
		System.out.println("a" + 30);
		
	}
	
	public static void main(String[] args) 
	{
		JavaProgram jp = new JavaProgram();
		System.out.println(jp.b);
		jp.printVar();
	}
	
	
}
