package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync3 {
//PROGRAM TO CREATE CUSTOM EXPECTED CONDITION USING ANANYMOUS INNER CLASS
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./divers/chromedrier.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				return driver.getTitle().equals("Google");
			}
			
			@Override
			public String toString() {
				return "Sorry, title is not same";
			}
		
		});
	}
}
