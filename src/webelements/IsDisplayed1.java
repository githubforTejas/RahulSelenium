package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		if (driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println("PASS :: THE SEARCH BAR DISPLAYED");
		}else {
			System.out.println("FAIL :: THE SEARCH BAR NOT DISPLAYED");
		}
		driver.quit();
	}
}
