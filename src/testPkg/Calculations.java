package testPkg;

public class Calculations 
{
	
	public Calculations()
	{
		System.out.println("this is a constructor");
		
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("this is addition of a&b: " + c);
		
	}
	public int printVar()
	{
		int a = 100;
		System.out.println(a);
		
		return a;
	}
	
	int a = 20;
	int b = 30;
	public int add()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("this is addition of a&b: " + c);
		return c;
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("this is sum of a&b: " + c);
		return c;
	}
	
	//40,50,60
	//x = 40+50
	//x+60
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("this output is from const is sum of a&b: " + c);
		
	}
	
	
	
	public static void main(String[] args) 
	{
		Calculations cal = new Calculations(45,27); 
		
		Calculations cal1 = new Calculations();
		
		int x = cal.add();
		int y = cal.sum(40, 50);
		cal.sum(y, 60);
		
		int z = cal.printVar();  //100
		
		
		

	}

}
