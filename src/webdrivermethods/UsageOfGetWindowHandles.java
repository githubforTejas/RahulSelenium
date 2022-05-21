package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {
	public static void main(String[] args) throws Exception {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the url
		driver.get("http://www.leafground.com/pages/Window.html");
		//Identify the button and click on it
		Thread.sleep(3000);
		WebElement OpenMultipleWindows = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		OpenMultipleWindows.click();
		Thread.sleep(1000);
		
		//get the windowID's of the current session
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		System.out.println("Count Of Windows: "+ allWindowId.size());
		//Iteratively get and print each window id on the console
		for (String wid : allWindowId) {
			System.out.println(wid);
		}
		driver.quit();
	}
}
 