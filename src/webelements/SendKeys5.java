package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys5 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		Thread.sleep(5000);
		username.sendKeys("Rahul");
		Thread.sleep(5000);
		username.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(5000);
		username.sendKeys(Keys.CONTROL+"X");
		Thread.sleep(5000);
		username.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(5000);
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(5000);
		pwd.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(5000);
		pwd.sendKeys(Keys.DELETE);
		Thread.sleep(5000);
		pwd.sendKeys("wadi");
		Thread.sleep(5000);
		driver.quit();
	}
}
