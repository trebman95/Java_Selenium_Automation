package org.blackplanet.automation.tb.pages;

import org.blackplanet.automation.tb.utilities.ReadPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void enter_displayname(String dname) throws Exception { // fill in display name
		driver.findElement(By.id(ReadPropertiesFile.element("signup_display_id"))).sendKeys(dname);	
	}
	
	public void enter_username(String uname) throws Exception { // fill in username
		driver.findElement(By.id(ReadPropertiesFile.element("signup_username_id"))).sendKeys(uname);	
	}
	
	public void enter_email(String email) throws Exception { // fill in email address
		driver.findElement(By.name(ReadPropertiesFile.element("signup_emailaddress_name"))).sendKeys(email);	
	}
	public void enter_password(String pword) throws Exception { // fill in password
		driver.findElement(By.name(ReadPropertiesFile.element("signup_password_name"))).sendKeys(pword);	
	}

	
}
