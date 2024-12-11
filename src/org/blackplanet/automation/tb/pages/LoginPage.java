package org.blackplanet.automation.tb.pages;

import org.blackplanet.automation.tb.utilities.ReadPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void enter_username(String uname) throws Exception { // fill in username
		driver.findElement(By.name(ReadPropertiesFile.element("login_username_name"))).sendKeys(uname);	
	}
	
	public void enter_password(String pword) throws Exception { // fill in password
		driver.findElement(By.name(ReadPropertiesFile.element("login_password_name"))).sendKeys(pword);	
	}
	
	public void click_loginbttn() throws Exception { // click login button
		driver.findElement(By.cssSelector(ReadPropertiesFile.element("login_loginBttn_css"))).click();;
	}
	
}
