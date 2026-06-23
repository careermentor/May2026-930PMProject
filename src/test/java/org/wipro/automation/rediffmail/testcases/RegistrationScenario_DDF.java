package org.wipro.automation.rediffmail.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.rediffmail.base.InitiateBrowser;
import org.wipro.automation.rediffmail.data.TestData_DDF;
import org.wipro.automation.rediffmail.pages.RegistrationPage;

public class RegistrationScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="register",dataProviderClass=TestData_DDF.class)
	public void tc001_registration_validation_valid_Credentials(String fullname, String email, String day) throws Exception
	{
		RegistrationPage reg = new RegistrationPage	(driver);
		
		reg.click_registerrediffmail();
		reg.enter_fullname_textbox(fullname);
		reg.enter_email_textbox(email);
		reg.select_dob_month(day);
				
	}
	
	
	
}
