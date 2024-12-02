package DemoTestNG;

import org.testng.annotations.Test;

public class TestScenario {

	@Test
	public void first_testcase() {
		System.out.println("First test case");
		
		//Assert.assertEquals("Hello", "Hello World");// (actual result, expected result)
	}
	
	@Test (enabled = false)
	public void second_testcase() {
		System.out.println("Second test case");
	}
}
