package org.blackplanet.tb.basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlackplanetWebdriver {
	WebDriver driver;
	
	
	public void launchBrower() throws Exception{
		driver = new ChromeDriver();
		driver.get("https://blackplanet.com/login");
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		BlackplanetWebdriver bpw = new BlackplanetWebdriver();
		bpw.launchBrower();
	}
	
}
