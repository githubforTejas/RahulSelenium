package testng;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running afterMethod");
	}
}
