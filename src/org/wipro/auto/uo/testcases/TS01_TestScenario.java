package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InitiativeBrowser;
import org.wipro.auto.uo.pages.LoginPage;

public class TS01_TestScenario extends InitiativeBrowser
{

	@Test
	public void tc01_validatevalidcrednloginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("pass1234");
		login.click_loginbttn();
	}
	
}
