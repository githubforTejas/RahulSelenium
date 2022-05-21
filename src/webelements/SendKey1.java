package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey1 {
//PROGRAM TO CLICK ON THE LOGIN BUTTON WITHOUT USING click()
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		//HERE WE ARE LOGGING IN USING ENTER BUTTON FROM KEYBOARD
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		driver.quit();
	}
}
