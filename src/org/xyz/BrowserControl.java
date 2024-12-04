package org.xyz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BrowserControl {

	WebDriver driver; 
	
	@Test
	public void dropdown_newaccount() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.name("firstname")).sendKeys("Jamal");
		driver.findElement(By.name("lastname")).sendKeys("Carmichael");
		
		WebElement abc = driver.findElement(By.name("birthday_month"));
		Select birth1 = new Select(abc);
		//birth1.selectByIndex(5);
		//birth1.selectByValue("6");
		birth1.selectByContainsVisibleText("Jun");
        
		WebElement efg = driver.findElement(By.name("birthday_day"));
		Select birth2 = new Select(efg);
		birth2.selectByContainsVisibleText("20");
		
		WebElement hij = driver.findElement(By.name("birthday_year"));
		Select birth3 = new Select(hij);
		birth3.selectByContainsVisibleText("1990");
		
		driver.findElement(By.xpath("//input[@class='_8esa' and @value='2']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("jamalweezy@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("passwrd5678");
		
		//driver.findElement(By.name("websubmit")).click();
		
	}
	
	@Test(enabled=false)
	public void validate_diffbrowsercontrol() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000); // Exception, 5 sec wait
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize(); // Maximize the window
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close(); // Close one window at a time
		driver.quit(); // Closing all of the windows
	}
	
}
