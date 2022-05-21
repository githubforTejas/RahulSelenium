package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script2_Click {
//PROGRAM TO SCROLL UPTO TARGET WEBELEMENT AND CLICK ON IT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		for(;;) {
			try {  
				driver.findElement(By.linkText("Celebrating Toni Stone")).click();
				break;
			} catch (NoSuchElementException e) {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("scrollBy(0,1500)");
			}
		}
		
		String expectedURLFraction = "https://www.google.com/doodles/celebrating-toni-stone";
		String actualURL = driver.getCurrentUrl();
		System.out.println("expectedURLFraction: " + expectedURLFraction);
		System.out.println("actualURL: " + actualURL);
		
		try {
			wait.until(ExpectedConditions.urlContains(expectedURLFraction));
			System.out.println("PASS: The Page is opened");
		} catch (TimeoutException e) {
			System.out.println("FAIL: The Page is not opened");
		}
		driver.quit();

	}
}
