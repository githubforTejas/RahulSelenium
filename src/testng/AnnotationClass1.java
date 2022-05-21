package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationClass1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running BeforeClass");
	}
	
	@Test
	public void testCase() {
		System.out.println("Running testCase");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Running AfterClass");
	}
}
