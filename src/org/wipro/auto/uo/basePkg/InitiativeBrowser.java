package org.wipro.auto.uo.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFiles;


public class InitiativeBrowser 
{

	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
			
		}
		
		driver.get(ReadPropFiles.readconfig("Application_URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
	
}
