package org.blackplanet.automation.tb.utilities;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static void config(String key) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\trebm\\eclipse-workspace\\Nov2024\\TestData\\config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get(key));
	}
	
	public static void element(String key) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\trebm\\eclipse-workspace\\Nov2024\\TestData\\element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get(key));
	}
	
	public static void main(String[] args) throws Exception {
		config("BrowserName");
		config("ApplicationURL");
		
		element("login_username_name");
		element("login_password_name");
		element("login_loginBttn_css");	
	}
	
	
}
