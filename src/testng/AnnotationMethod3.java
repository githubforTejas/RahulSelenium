package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationMethod3 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running beforeMethod");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Running testCase1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Running testCase2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running afterMethod");
	}
}
