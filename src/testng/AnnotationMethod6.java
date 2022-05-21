package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationMethod6 extends BaseTest {

	@BeforeMethod
	public void beforeMethod4Comment() {
		System.out.println("Running beforeMethod4Comment");
	}
	
	@Test
	public void addComment() {
		System.out.println("Running addComment testCase");
	}
	
	@AfterMethod
	public void afterMethod4Comment() {
		System.out.println("Running afterMethod4Comment");
	}
}
