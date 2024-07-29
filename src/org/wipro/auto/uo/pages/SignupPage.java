package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.uo.utilitiesPkg.ReadPropFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFiles.readelement("signup_dob_day_name"))));
		dob_day.selectByVisibleText(day);
		
	}
	
	public void click_female() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("signup_female_xpath"))).click();
	}
	
}