package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser3 {
	
	@Parameters("browser")
	@Test
	public void testLogin3(String browser) {
		System.out.println("From testLogin3= "+browser);
	}
 }

