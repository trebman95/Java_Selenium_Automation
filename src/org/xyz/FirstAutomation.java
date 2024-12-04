package org.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation {

	WebDriver driver; 
	
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver(); // Launch the chrome browser
		driver.get("https://www.facebook.com/");	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void validate_loginfunct() {
		driver.findElement(By.id("email")).sendKeys("user1"); // Type username
		driver.findElement(By.id("pass")).sendKeys("pass4567"); // Type password
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test
	public void validate_signupfunct() {
		driver.findElement(By.linkText("Create new account")).click(); // Click "Create new account" button
		driver.findElement(By.name("firstname")).sendKeys("Jamal");
		driver.findElement(By.name("lastname")).sendKeys("Weezy");
	}
	
}
