package org.xyz;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	

	public static void test_results(WebDriver Driver, String name)throws Exception{
		
		TakesScreenshot ts = (TakesScreenshot) Driver; // Takes Screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE); // Saving the file
		
		File fd = new File("./TestResults/" + name + ".png"); // Store the file in this location
		
		String xyz = "Java";
		System.out.println("Print the value" + xyz + "this is output");
		
		FileUtils.copyFile(f, fd);
	}
}
