package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CrossBrowserBaseTest {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Running AfterTest");
	}
}


