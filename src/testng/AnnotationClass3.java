package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationClass3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running BeforeClass");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Running testCase1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Running testCase2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Running AfterClass");
	}
}
