package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS01_TestScenario 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		
	}
	@Test
	public void validate_login_func()
	{
		
		driver.findElement(By.id("email")).sendKeys("modisantos@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pas1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test
	public void validate_signup_func() throws Exception
	{
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
			
	}
}
