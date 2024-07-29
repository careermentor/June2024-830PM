package org.wipro.auto.uo.testcases;


import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InitiativeBrowser;
import org.wipro.auto.uo.datageneratorpkg.TestDataGenerator;
import org.wipro.auto.uo.pages.LoginPage;

public class TS01_TestScenario_DDF extends InitiativeBrowser
{

	@Test(dataProvider="ddfdata1",dataProviderClass=TestDataGenerator.class)
	public void tc01_validatevalidcrednloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
}
