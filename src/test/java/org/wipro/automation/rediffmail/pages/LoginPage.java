package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.rediffmail.utilities.ReadDataFiles;

public class LoginPage 
{

	WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void enter_username_textbox(String uname) throws Exception
	{
		driver.findElement(By.id(ReadDataFiles.read_element_Data("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		driver.findElement(By.name(ReadDataFiles.read_element_Data("login_password_name"))).sendKeys(pass);
	}
	
	public void click_checkbox_rememberme() throws Exception
	{
		driver.findElement(By.cssSelector(ReadDataFiles.read_element_Data("login_checkbox_rememberme_css"))).click();
	}
	
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.className(ReadDataFiles.read_element_Data("login_loginbttn_class"))).click();
	}
	
}
