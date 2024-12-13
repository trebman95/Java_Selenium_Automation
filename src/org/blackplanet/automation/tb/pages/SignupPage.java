package org.blackplanet.automation.tb.pages;

import org.blackplanet.automation.tb.utilities.ReadPropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void click_createnewaccountbttn() throws Exception { // click sign up button
		driver.findElement(By.xpath(ReadPropertiesFile.element("login_createnewaccount_xpath"))).click();
	}

	public void enter_displayname(String dname) throws Exception { // fill in display name
		driver.findElement(By.id(ReadPropertiesFile.element("signup_display_id"))).sendKeys(dname);	
	}
	
	public void enter_username(String uname) throws Exception { // fill in username
		driver.findElement(By.id(ReadPropertiesFile.element("signup_username_id"))).sendKeys(uname);	
	}
	
	
	public void click_genderdropdownselect() throws Exception { // click gender dropdown and choose Man
		driver.findElement(By.id(ReadPropertiesFile.element("signup_gender_id"))).click();
	}
	
	public void click_genderchoose() throws Exception { //choose Man
		driver.findElement(By.xpath(ReadPropertiesFile.element("signup_genderchoice_xpath"))).click();
	}
	
	public void enter_email(String email) throws Exception { // fill in email address
		driver.findElement(By.cssSelector(ReadPropertiesFile.element("signup_emailaddress_css"))).sendKeys(email);	
	}
	
	public void enter_password(String pword) throws Exception { // fill in password
		driver.findElement(By.cssSelector(ReadPropertiesFile.element("signup_password_css"))).sendKeys(pword);	
	}
	
	public void confirm_password(String pword2) throws Exception { // confirm passowrd
		driver.findElement(By.cssSelector(ReadPropertiesFile.element("signup_confirmpswrd_css"))).sendKeys(pword2);	
	}
	
	public void click_dob_month() throws Exception {
		driver.findElement(By.id(ReadPropertiesFile.element("signup_birthdaymonthdropdown_id"))).click();
	
	}
	
	public void month_choose() throws Exception {
		driver.findElement(By.xpath(ReadPropertiesFile.element("signup_birthdaymonth_xpath"))).click();
	}
	
	public void click_dob_day() throws Exception {
		driver.findElement(By.id(ReadPropertiesFile.element("signup_birthdaydaydropdown_id"))).click();
	}
	
	public void day_choose() throws Exception {
		driver.findElement(By.xpath(ReadPropertiesFile.element("signup_birthdayday_xpath"))).click();
	}
	
	
	public void click_dob_year() throws Exception {
		driver.findElement(By.id(ReadPropertiesFile.element("signup_birthdayyeardropdown_id"))).click();
	}
	
	public void year_choose() throws Exception {
		driver.findElement(By.xpath(ReadPropertiesFile.element("signup_birthdayyear_xpath"))).click();
	}

	public void click_signupbttn() throws Exception { // click next button
		driver.findElement(By.xpath(ReadPropertiesFile.element("signup_signupbttn_xpath"))).click();;
	}
	
}
