package org.blackplanet.tb.basepkg;
 
import java.time.Duration;
 
import org.blackplanet.automation.tb.utilities.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
 
//import org.testng.annotations.Test;
 
public class InitiateBrowser {
	
	public WebDriver driver; // Using for other packages
	
	// Headless options when running in CI (GitHub Actions sets the CI variable automatically)
	private ChromeOptions chromeOptions() {
		ChromeOptions options = new ChromeOptions();
		if (System.getenv("CI") != null) {
			options.addArguments("--headless=new", "--no-sandbox",
					"--disable-dev-shm-usage", "--window-size=1920,1080");
		}
		return options;
	}
	
	@BeforeMethod
	public void launchBrower() throws Exception{
		
		if(ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Chrome")) {
		  
		  // Selenium Manager (built into Selenium 4) finds the matching ChromeDriver automatically
		  driver = new ChromeDriver(chromeOptions());
		  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Edge")) {
		  
		  
		  EdgeOptions options = new EdgeOptions();

			options.addArguments("--headless=new");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-gpu");
			options.addArguments("--window-size=1920,1080");
			
		  driver = new EdgeDriver(options);
		  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("IE")) {
			
		  driver = new InternetExplorerDriver();
		  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Firefox")) {
			
		  driver = new FirefoxDriver();
			  
		} else if (ReadPropertiesFile.config("BrowserName").equalsIgnoreCase("Safari")) {
			
		  driver = new SafariDriver();
			  
		}  else {
			
		  driver = new ChromeDriver(chromeOptions());	
		}
		
		driver.get(ReadPropertiesFile.config("ApplicationURL")); // Gather the URL
		driver.manage().window().maximize(); // Expand the window
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300)); // 3 sec wait time to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod(alwaysRun = true)
	public void closebrowser() {
	    
		if (driver != null) {
			driver.quit();
		}
	}
	
	
}
