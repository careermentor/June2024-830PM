package testPkg;

public class CallAbsClass extends AbsClassDemo
{

	
	public void credential() 
	{
	
		System.out.println("this is my credential");
		
	}

	public static void main(String[] args) {
		
		CallAbsClass aca =new CallAbsClass();
		aca.meth1();
		aca.credential();
		
	}
	
}
