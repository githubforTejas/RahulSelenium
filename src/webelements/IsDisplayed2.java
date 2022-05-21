package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?source=login");
		Thread.sleep(5000);
		WebElement passwordfield = driver.findElement(By.id("password"));
		if (passwordfield.isDisplayed()) {
			System.out.println("PASS :: THE PASSWORD FIELD IS NOT DISPLAYED");
		}else {
			System.out.println("FAIL :: THE PASSWORD FIELD IS  DISPLAYED");
		}
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("vahgjhj1234@gmail.com");
		driver.findElement(By.cssSelector("button[data-continue-to='password-container']")).click();
		Thread.sleep(10000);
		if (passwordfield.isDisplayed()) {
			System.out.println("PASS :: THE PASSWORD FIELD IS  DISPLAYED");
		}else {
			System.out.println("FAIL :: THE PASSWORD FIELD IS NOT DISPLAYED");
		}
		driver.quit();
	}
}
