package org.blackplanet.tb.basepkg;

import java.time.Duration;

import org.blackplanet.automation.tb.utilities.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.Test;

public class InitiateBrowser {
	
	public WebDriver driver; // Using for other packages
	
	
	@BeforeMethod
	public void launchBrower() throws Exception{
		
		if(ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Chrome")) {
		  
		  WebDriverManager.chromedriver().setup(); // Manages old/new browser or selenium
		  driver = new ChromeDriver();
		  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Edge")) {
		  
		  driver = new EdgeDriver();
		  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("IE")) {
			
		  driver = new InternetExplorerDriver();
		  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Firefox")) {
			
		  driver = new FirefoxDriver();
			  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Safari")) {
			
		  driver = new SafariDriver();
			  
		}  else {
			
		  driver = new ChromeDriver();	
		}
		
		driver.get(ReadPropertiesFile.config("ApplicationURL")); // Gather the URL
		driver.manage().window().maximize(); // Expand the window
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300)); // 3 sec wait time to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod(enabled=false)
	public void closebrowser() {
	    
		driver.quit();		
	}
	
	
}
