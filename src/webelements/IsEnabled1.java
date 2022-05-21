package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled1 {
//To Verify target element is enabled or disabled
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://live.skillrary.com/testing-app/");
		if (!driver.findElement(By.cssSelector("input[class='form-control']")).isEnabled()) {
			System.out.println("Pass::The Subscriber Text Is Disabled");
		}else {
			System.out.println("Fail::The Subscriber Text Is Enabled");
		}
		driver.quit();
	}
}
