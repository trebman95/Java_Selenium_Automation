package org.blackplanet.automation.tb.testcases;

import org.blackplanet.automation.tb.pages.SignupPage;
import org.blackplanet.tb.basepkg.InitiateBrowser;
import org.testng.annotations.Test;

public class SignupScenario extends InitiateBrowser {
	
	@Test
	public void tc02_validate_validcred_signupfunct() throws Exception {
		
		SignupPage signup = new SignupPage(driver);
		signup.click_createnewaccountbttn();
		signup.enter_displayname("John");
		signup.enter_username("john3455");
		signup.click_genderdropdownselect();
		signup.click_genderchoose();
		signup.enter_email("johnsmith123@yahoo.com");
		signup.enter_password("pass1234");
		signup.confirm_password("pass1234");
		signup.click_dob_month();
		signup.month_choose();
		signup.click_dob_day();
		signup.day_choose();
		signup.click_dob_year();
		signup.year_choose();
		signup.click_signupbttn();	
	}
	
}
