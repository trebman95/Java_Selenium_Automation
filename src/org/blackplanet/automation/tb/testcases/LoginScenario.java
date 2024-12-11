package org.blackplanet.automation.tb.testcases;

import org.blackplanet.automation.tb.pages.LoginPage;
import org.blackplanet.tb.basepkg.InitiateBrowser;
import org.testng.annotations.Test;

public class LoginScenario extends InitiateBrowser {
	
	@Test
	public void tc01_validate_validcred_loginfunct() throws Exception {
		
		LoginPage login = new LoginPage(driver); // taken from pages package
		login.enter_username("user1");
		login.enter_password("pass1414");
		login.click_loginbttn();
		
		
	}
	
	//This.driver is null, pass it through the Login Page (Create a constructor)
}
