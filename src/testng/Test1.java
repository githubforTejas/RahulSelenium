package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
//BASIC PROGRAM USING TESTNG
public class Test1 {
	
	@Test
	public void testLogin() {
		Reporter.log("Running testLogin test case", true);
	}
}
