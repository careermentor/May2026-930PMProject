package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.data.TestData_DDF;
import org.wipro.automation.rediffmail.pages.LoginPage;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="login",dataProviderClass=TestData_DDF.class)
	public void tc001_login_validation_valid_Credentials(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username_textbox(username);
		login.enter_password_textbox(password);
		//login.click_checkbox_rememberme();
		//login.click_loginbttn();
				
	}
	
	
	
}
