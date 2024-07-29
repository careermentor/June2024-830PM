package testPkg;

public class QA2 extends QA1
{
	
	int x = 50;
	
	
	
	public void callsum()
	{
		super.sum(30, 40);
	}
	
	public void printVal()
	{
		final int x = 100;
		//x=200;
		System.out.println(x);  //100
		System.out.println(this.x);  //50
		
		System.out.println(super.x);//500
		
		super.sum(30, 50);
		
		
	}
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
		System.out.println(x);  //50
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		
	}
	
	public static void main(String[] args) 
	{

		QA2 q2 = new QA2();
		q2.sub(30, 40);
		
		q2.sum(30, 40);  //a*a+b*b
		
		q2.printVal();
		q2.callsum();
	}


	
	public void qa1im() {
	
		System.out.println("this is method of QA1I");
		
	}
	
}
