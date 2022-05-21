package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForestTest2_Priority {
	
	//TO DISABLE THE TEST CASE
	@Test(enabled=false)
	public static void lionTest() {
		System.out.println("Lion is the King Of Forest");
	}
	@BeforeMethod
	public static void tigerTest() {
		System.out.println("tiger is the King Of Forest");
	}
	@AfterClass
	public static void buffaloTest() {
		System.out.println("buffalo is the King Of Forest");
	}
	@AfterMethod
	public static void giraffeTest() {
		System.out.println("giraffe is the King Of Forest");
	}
	@BeforeClass
	public static void rhinoTest() {
		System.out.println("rhino is the King Of Forest");
	}
	@Test(priority = 01)
	public static void peackockTest() {
		System.out.println("peackock is the King Of Forest");
	}
	
	
}
