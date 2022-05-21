package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Try Free']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("First Name")).sendKeys("Kiran");
		Thread.sleep(3000);
		driver.findElement(By.id("Last Name")).sendKeys("Krithika");
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("kk69@hotmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Company")).sendKeys("Pirex Star");
		Thread.sleep(3000);
		driver.findElement(By.id("confirm-button")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
