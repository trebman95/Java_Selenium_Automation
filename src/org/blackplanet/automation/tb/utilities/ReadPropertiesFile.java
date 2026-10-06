package org.blackplanet.automation.tb.utilities;
 
import java.io.FileReader;
import java.util.Properties;
 
public class ReadPropertiesFile {
 
	// Paths are relative to the project root, so they work on any machine (Windows, macOS, Linux CI)
	private static final String CONFIG_FILE = "TestData/config.properties";
	private static final String ELEMENT_FILE = "TestData/element.properties";
 
	public static String config(String key) throws Exception {
		return read(CONFIG_FILE, key);
	}
 
	public static String element(String key) throws Exception {
		return read(ELEMENT_FILE, key);
	}
 
	private static String read(String file, String key) throws Exception {
		Properties prop = new Properties();
		try (FileReader fr = new FileReader(file)) {
			prop.load(fr);
		}
		String value = prop.getProperty(key);
		if (value == null) {
			throw new IllegalArgumentException("Key '" + key + "' not found in " + file);
		}
		return value;
	}
 
}
	
	
}
