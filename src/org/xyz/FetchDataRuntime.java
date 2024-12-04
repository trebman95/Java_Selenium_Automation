package org.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FetchDataRuntime {

	WebDriver driver; 
	
	@Test
	public void checkthefields() throws Exception {
		driver = new ChromeDriver();
		
		String expURL = "https://www.facebook.com/";
		driver.get(expURL);
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL); // Fetch URL from the browser
		Assert.assertEquals(actualURL, expURL);
		
		String expLoginPage = "Facebook - log in or sign up";
		String actualLoginPage = driver.getTitle();
		System.out.println(actualLoginPage); // Fetch Title of the application
		Assert.assertEquals(actualLoginPage, expLoginPage);
		
		String exp_username_Field = "Email or phone number";
		String actual_username_Field = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(actual_username_Field); // Fetch Attribute Value of the element
		Assert.assertEquals(actual_username_Field, exp_username_Field);
		
		String exp_login_link = "Log In"; 
		String actual_login_link = driver.findElement(By.name("login")).getText();
	    System.out.println(actual_login_link); // Fetching linkText value of the element
		Assert.assertEquals(actual_login_link, exp_login_link);
		
		System.out.println(driver.findElement(By.name("login")).getLocation());// Location coordinates of the element
		System.out.println(driver.getPageSource()); // Fetch complete HTML page
	}
	
}
