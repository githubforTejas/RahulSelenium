package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	@Parameters("browser")
	@Test
	public void testLogin1(String browser) {
		System.out.println("From testLogin1= "+browser);
	}
 }

