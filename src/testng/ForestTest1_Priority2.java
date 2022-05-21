package testng;

import org.testng.annotations.Test;

public class ForestTest1_Priority2 {
	
	@Test(priority = 2)
	public static void lionTest() {
		System.out.println("Lion is the King Of Forest");
	}
	@Test(priority = 1)
	public static void tigerTest() {
		System.out.println("tiger is the King Of Forest");
	}
	
	@Test
	public static void buffaloTest() {
		System.out.println("buffalo is the King Of Forest");
	}
	
	@Test
	public static void giraffeTest() {
		System.out.println("giraffe is the King Of Forest");
	}
	@Test(priority = -2)
	public static void rhinoTest() {
		System.out.println("rhino is the King Of Forest");
	}
	@Test(priority = -1)
	public static void peackockTest() {
		System.out.println("peackock is the King Of Forest");
	}
	
	
}
