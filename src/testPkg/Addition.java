package testPkg;

 public class Addition 
{
	
	int a = 50;  //global variable
	//a=100;
	int b = 60;  //global variable
	
	 public void add()
	{

		final int a = 200;  ///local variable
		//a = 400;
		int b = 300;   ///local variable
			
		int c = a+b;
		System.out.println(a+b);
		System.out.println(c);
	}
	 
	 public void printVar()
	 {
		 System.out.println(a);
		 System.out.println(b);
	 }
	
	

	public static void main(String[] args) 
	{
	
		Addition ad = new Addition();
		ad.add();
		ad.printVar();
		
	}
	
}
