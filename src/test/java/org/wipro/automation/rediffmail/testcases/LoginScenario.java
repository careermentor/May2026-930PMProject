package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.pages.LoginPage_PF;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc001_login_validation_valid_Credentials() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username_textbox("John1");
		login.enter_password_textbox("pass1234");
		//login.click_checkbox_rememberme();
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
	
}
