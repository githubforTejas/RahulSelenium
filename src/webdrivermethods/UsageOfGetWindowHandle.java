package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String windowId = driver.getWindowHandle();
		System.out.println("WINDOWID = " + windowId);
		Thread.sleep(1000);
		driver.quit();
	}
}
