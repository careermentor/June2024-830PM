package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BrowserControl 
{

	WebDriver driver;
	
	
	@Test
	public void testingworld() 
	{
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.findElement(By.name("fld_username")).sendKeys("automation");
		
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected()); //false
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected()); //true
		
		//driver.findElement(By.className("displayPopup")).click();
		
		//driver.findElement(By.className("close")).click();
		
		WebElement abc = driver.findElement(By.name("sex"));
		
		Select gen = new Select(abc);
		
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		
		//gen.selectByIndex(1);
		
		//gen.deselectAll();
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "California"));
		
		st.selectByVisibleText("Florida");
			
	}
		
	
	
	@Test(enabled=false)
	public void launchBrowser() 
	{
		driver= new ChromeDriver();  //launch the chrome browser
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("java");
		
		driver.findElement(By.name("email")).clear();
		
		driver.findElement(By.name("email")).sendKeys("selenium");	
			
	}
			
			
			
		/*
		  driver.navigate().to("https://www.santoshmodi.com");
		 
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.santoshmodi.com");
		
		//driver.close(); //close the single window
		*/
		//driver.quit();  //close all the windows
		
	
	
}
