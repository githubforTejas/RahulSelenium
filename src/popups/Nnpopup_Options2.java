package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Nnpopup_Options2 {
//PROGRAM TO AVOID NOTIFICATION POPUP IN CHROME USING CHROMEOPTIONS CLASS
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		options.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("nameishemanth105@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Testing@123");
		driver.findElement(By.name("login")).click();
	}
}
