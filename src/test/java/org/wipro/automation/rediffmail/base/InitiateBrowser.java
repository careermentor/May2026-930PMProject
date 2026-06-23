package org.wipro.automation.rediffmail.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.rediffmail.utilities.ReadDataFiles;

public class InitiateBrowser
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadDataFiles.read_config_Data("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		
		else if(ReadDataFiles.read_config_Data("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else if(ReadDataFiles.read_config_Data("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadDataFiles.read_config_Data("Application_URL"));
		
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
