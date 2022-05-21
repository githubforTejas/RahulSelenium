package testng;

import org.testng.annotations.Test;

public class Groups2 {

	@Test(dependsOnGroups = "login")
	public void test() {
		System.out.println("RUNNING test TEST CASE");	
	}
}
