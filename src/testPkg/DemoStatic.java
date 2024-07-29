package testPkg;

public class DemoStatic 
{
	static int a = 100;
	
	
	public static void printVar()
	{
		
		System.out.println(a);
	}
	
	
	public void stmethod()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) 
	{
		
		DemoStatic.printVar();
		
		DemoStatic dc = new DemoStatic();
		dc.stmethod();
		
	}
	
}
