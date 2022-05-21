package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		
		for(;;) {
			try {
				driver.findElement(By.linkText("Valentine's Day 2022")).click();
				break;
			} catch (NoSuchElementException e) {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("scrollBy(0,2000);");
			}
		}
		driver.quit();
	}
}
