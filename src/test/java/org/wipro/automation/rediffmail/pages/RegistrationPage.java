package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.rediffmail.utilities.ReadDataFiles;

public class RegistrationPage 
{

	WebDriver driver;
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	

	public void click_registerrediffmail() throws Exception
	{
		driver.findElement(By.xpath(ReadDataFiles.read_element_Data("login_rediff_mail_xpath"))).click();
	}
	
	public void enter_fullname_textbox(String fname) throws Exception
	{
		driver.findElement(By.cssSelector(ReadDataFiles.read_element_Data("registerPage_fullname_css"))).sendKeys(fname);
	}
	
	public void enter_email_textbox(String email) throws Exception
	{
		driver.findElement(By.cssSelector(ReadDataFiles.read_element_Data("registration_page_email_css"))).sendKeys(email);
	}
	
	public void select_dob_month(String day) throws Exception
	{
		WebElement ws = driver.findElement(By.cssSelector(ReadDataFiles.read_element_Data("registration_daob_day_css")));
		Select dob_day = new Select(ws);
		dob_day.selectByVisibleText(day);
		
	}
	
	
}
