package org.xyz;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlekbMsWi {

	WebDriver driver; 
	
	@Test
	public void handleFrames() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.test_results(driver, "handleFrames"); // Screenshot
	}
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert().accept(); // Accepting alerts
		CaptureScreenshot.test_results(driver, "handleAlerts");
	}
	
	@Test(enabled=false)
	public void handleMouse() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[@text()='Our Approach']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//a[@text()='Our Approach']"))).perform(); // Right Click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(@text(),'Hi-Tech')]"))).perform();
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).keyUp(Keys.CONTROL).perform();	
	
		Set<String> winsid = driver.getWindowHandles(); // Handling mulptiple windows
		
		Iterator<String> itr = winsid.iterator(); // Helps switch windows
		
		//String win1 = itr.next(); // Window 1
		String win2 = itr.next(); // Window 2
		
		//driver.switchTo().window(win1);
		driver.switchTo().window(win2);
	
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		//act.sendKeys(Keys.PAGE_DOWN).perform(); Page Down
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("pass1234").perform();
		act.sendKeys(Keys.ENTER).perform();
	
	}
	
}
