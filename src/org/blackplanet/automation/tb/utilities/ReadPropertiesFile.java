package org.blackplanet.automation.tb.utilities;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static String config(String key) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\trebm\\eclipse-workspace\\Nov2024\\TestData\\config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
	}
	
	public static String element(String key) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\trebm\\eclipse-workspace\\Nov2024\\TestData\\element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.get(key).toString();
	}
	
	
	
}
