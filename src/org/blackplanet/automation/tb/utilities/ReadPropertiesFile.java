package org.blackplanet.automation.tb.utilities;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static void config() throws Exception{
		FileReader fr = new FileReader("C:\\Users\\trebm\\eclipse-workspace\\Nov2024\\TestData\\config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("BrowserName"));
		System.out.println(prop.get("ApplicationURL"));
		//System.out.println(prop.get(key));
	}
	
	public static void element(String key) throws Exception{
		FileReader fr = new FileReader("C:\\Users\\trebm\\eclipse-workspace\\Nov2024\\TestData\\element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("login_username_name"));
		System.out.println(prop.get("login_password_name"));
		System.out.println(prop.get("login_loginBttn_css"));
	}
	
	public static void main(String[] args) throws Exception {
		config();
		//element();
	}
	
	
}
