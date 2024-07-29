package org.wipro.auto.uo.datageneratorpkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator
{

	@DataProvider(name="ddfdata")
	public Object[][] testdata()
	{
		//Object[] data = {"user1","pass1"};  //1-Dimensional array
		Object[][] data1 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-Dimensional array
		
		return data1;
		
	}
	
	@DataProvider(name="ddfdata1")
	public Object[][] testdata1()
	{
		//Object[] data = {"user1","pass1"};  //1-Dimensional array
		Object[][] data1 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-Dimensional array
		
		return data1;
		
	}
}
