package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
//BASIC PROGRAM USING TESTNG TO PRINT IN BOTH JAVA CONSOLE & IN REPORT
public class Test1 {
	
	@Test
	public void testLogin() {
		Reporter.log("Running testLogin test case", true);
	}
}
