package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser2 {
	
	@Parameters("browser")
	@Test
	public void testLogin2(String browser) {
		System.out.println("From testLogin2= "+browser);
	}
 }

