package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{

	WebDriver driver;
	
	
	@Test
	public void testingworld() 
	{
		driver= new ChromeDriver();  //launch the chrome browser
		
		String expURL = "https://www.facebook.com";
		
		driver.get(expURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, expURL);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, expURL);
		
		System.out.println("this is step 30 is not to be failed");
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		Assert.assertEquals(actTitle, ExpTitle);
		
		String ExpUnameField = "Email address or phone number";
		
		String ActUnamefield = 	driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUnamefield);
		sa.assertEquals(ActUnamefield, ExpUnameField);
		
		String ExpLogin = "Log in";
		String ActLogin = driver.findElement(By.name("login")).getText();
		
		System.out.println(ActLogin);
		
		sa.assertEquals(ActLogin, ExpLogin);
		
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		//System.out.println(driver.getPageSource());
		
		
		sa.assertAll();
		
	}		
}
