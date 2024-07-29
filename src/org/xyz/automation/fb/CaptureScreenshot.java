package org.xyz.automation.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	public static void screenresult(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;  //print screen
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./ScreenshotResult/"+ name +".png");
		
		int a = 10;
		System.out.println("print value of a: " + a + "this is a number");
		
		FileUtils.copyFile(f, fd);
		
		
	}
	
}
