package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetPageSource {
	public static void main(String[] args) {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		ChromeDriver driver=new ChromeDriver();
		//pass the main url
		driver.get("https://test.testrail.net/");
		String expectedText = "Log into Your Account";
		System.out.println("EXPECTED TEXT = " + expectedText);
		String actualPageSource = driver.getPageSource();
		System.out.println("ACTUAL PAGE SOURCE: " + actualPageSource);
		if (actualPageSource.contains(expectedText)) {
			System.out.println("Pass: THE TEXT IS AVAILABLE");
		}else {
			System.out.println("FAIL: THE TEXT IS NOT AVAILABLE");
		}
		driver.quit();
	}
}