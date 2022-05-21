package testng;

import org.testng.annotations.Test;

@Test(enabled = false)
//HERE CLASS ONLY DISABLED BUT ALSO IF WE WANT TO RUN ANY TEST CASE THEN
public class ForestTest6_EnableMethod {
	
	public static void lionTest() {
		System.out.println("Lion is the King Of Forest");
	}
	@Test(enabled = true)
	public static void tigerTest() {
		System.out.println("tiger is the King Of Forest");
	}
	
	public static void buffaloTest() {
		System.out.println("buffalo is the King Of Forest");
	}
	
	public static void giraffeTest() {
		System.out.println("giraffe is the King Of Forest");
	}
	
	public static void rhinoTest() {
		System.out.println("rhino is the King Of Forest");
	}
	
	public static void peackockTest() {
		System.out.println("peackock is the King Of Forest");
	}
	
	
}
