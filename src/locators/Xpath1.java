package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nbtindia.gov.in/");
		Thread.sleep(4000);
		driver.findElement(By.name("search")).sendKeys("Subash Chandra Bose");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span/button")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
