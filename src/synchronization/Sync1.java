package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		FluentWait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1));
		
		wait.until(new My_Condition("Rahul"));
		System.out.println("PASS");
		driver.quit();
	}
}
