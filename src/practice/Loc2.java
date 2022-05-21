package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("session_key")).sendKeys("raheifh");
		Thread.sleep(4000);
		driver.findElement(By.id("session_password")).sendKeys("999999");
		Thread.sleep(4000);
		driver.quit();
	}
}
