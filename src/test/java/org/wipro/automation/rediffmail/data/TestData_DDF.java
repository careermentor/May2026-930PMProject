package org.wipro.automation.rediffmail.data;

import org.testng.annotations.DataProvider;

public class TestData_DDF 
{

	

	@DataProvider(name="login")
	public Object[][] login_Data()
	{
		//String data1 = "John1";
		//Object[] data2 = {"john1","john1234"};
		Object[][] data3 = {{"john1","john1234"},{"David","David1234"},{"Neena","Neena123"}};
		return data3;
		
	}
	
	
	@DataProvider(name="register")
	public Object[][] register_Data()
	{
		//String data1 = "John1";
		//Object[] data2 = {"john1","john1234"};
		Object[][] data3 = {{"John","John@yahoo.com","05"},{"David","david@yahoo.com","06"},{"Neena","Neena@yahoo.com","07"}};
		return data3;
		
	}
	
}
