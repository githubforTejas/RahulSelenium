package testng;

import org.testng.annotations.Test;

@Test(enabled = false)
//WHEN EVERY TEST CASE IS NOT ANNOTATED THE WE CAN USE ABOVE ONE
public class ForestTest5_DisableClass {
	
	public static void lionTest() {
		System.out.println("Lion is the King Of Forest");
	}
	
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
