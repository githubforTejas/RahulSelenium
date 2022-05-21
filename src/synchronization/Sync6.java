package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync6 {
//PROGRAM USING CUSTOM WAIT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		for(int i=1; i<100; i++)
		{
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("PASS");
				break;
			} catch (NoSuchElementException e) {
				System.out.println("FAIL");
			}
		}
		driver.quit();
	}
}
