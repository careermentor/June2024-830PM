package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.basePkg.InitiativeBrowser;
import org.wipro.auto.uo.pages.SignupPage;

public class TS02_TestScenario_SignUp extends InitiativeBrowser
{

	@Test
	public void tc01_validatesignupfunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccount();
		sign.enter_firstname("Selenium");
		sign.select_dob_day("26");
		sign.click_female();
	}
	
}
