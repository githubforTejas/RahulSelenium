package runtimepolymorphism;

import org.openqa.selenium.WebDriver;

public class Factory {

	public static void test(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://google.com/");

		//Code to verify the URL
		String expectedUrl = "https://www.google.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("expectedUrl: " + expectedUrl);
		System.out.println("actualUrl: " + actualUrl);
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("PASS:: THE URL IS CORRECT");
		}else {
			System.out.println("FAIL:: THE URL IS WRONG");
		}

		//Code to verify the title
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle: " + expectedTitle);
		System.out.println("actualTitle: " + actualTitle);
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("PASS:: THE TITLE IS CORRECT");
		}else {
			System.out.println("FAIL:: THE TITLE IS WRONG");
		}
		driver.quit();
	}
}
