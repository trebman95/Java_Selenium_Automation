package org.blackplanet.automation.tb.testcases;

import org.blackplanet.automation.tb.datagenerator.TestDataGenerator;
import org.blackplanet.automation.tb.pages.LoginPage;
import org.blackplanet.tb.basepkg.InitiateBrowser;
import org.testng.annotations.Test;

public class LoginScenario_DDF extends InitiateBrowser {
	
	@Test(dataProvider="ddf_data", dataProviderClass=TestDataGenerator.class)
	public void tc01_vloginfunct(String uname, String pass) throws Exception {
		
		LoginPage login = new LoginPage(driver); // taken from pages package
		login.enter_username(uname);
		login.enter_password(pass);
		login.click_loginbttn();
		
		
	}
	

}
