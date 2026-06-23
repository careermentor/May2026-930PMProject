package org.wipro.automation.rediffmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.automation.rediffmail.utilities.ReadDataFiles;

public class LoginPage_PF 
{

	WebDriver driver;
	
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login1")
	WebElement username_textbox;
	
	@FindBy(name="passwd")
	WebElement password_textbox;
	
	@FindBy(css="login_checkbox_rememberme_css")
	WebElement click_checkbox;
	
	@FindBy(className="signin-btn")
	WebElement click_loginbttn;
	
	public void enter_username_textbox(String uname) throws Exception
	{
		//WebElement username_textbox  =driver.findElement(By.id(ReadDataFiles.read_element_Data("login_username_id")));
		username_textbox.sendKeys(uname);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		//driver.findElement(By.name(ReadDataFiles.read_element_Data("login_password_name"))).
		password_textbox.sendKeys(pass);
	}
	
	public void click_checkbox_rememberme() throws Exception
	{
		//driver.findElement(By.cssSelector(ReadDataFiles.read_element_Data("login_checkbox_rememberme_css"))).
		click_checkbox.click();
	}
	
	public void click_loginbttn() throws Exception
	{
		//driver.findElement(By.className(ReadDataFiles.read_element_Data("login_loginbttn_class"))).
		click_loginbttn.click();
	}
	
}
