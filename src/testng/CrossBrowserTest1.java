package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrossBrowserTest1 {

		@BeforeTest
		public void beforeTest() {
			System.out.println("Running BeforeTest");
		}
		
		@Test(invocationCount = 2)
		public void testCase() {
			System.out.println("Running testCase");
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("Running AfterTest");
		}
}
