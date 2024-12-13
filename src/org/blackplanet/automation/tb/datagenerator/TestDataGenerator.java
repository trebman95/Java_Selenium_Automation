package org.blackplanet.automation.tb.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator {

	@DataProvider(name="ddf_data") // used from TestNG
	public Object[][] testdata() {
		
		//String data1 = "user1";
		//Object [] data2 = {"user1", "pass1"};
		Object [] [] data3 = {{"user1", "pass"},{"user2", "pass2"},{"user3", "pass3"}}; // 2D Array
		return data3;
	}
}
