package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser4 {
	
	@Parameters("browser")
	@Test
	public void testLogin4(@Optional("edge")String browser) {
		System.out.println("From testLogin4= "+browser);
	}
 }

