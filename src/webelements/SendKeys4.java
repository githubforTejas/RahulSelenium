package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("Rahul");
		//In above condition it will merge username with admin so
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Rahul");
		Thread.sleep(5000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(5000);
		password.sendKeys("rahulwadi");
		driver.quit();
		}
}
