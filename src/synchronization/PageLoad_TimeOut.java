package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoad_TimeOut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("PASS::THE PAGE HAS LOADED WITHIN 10 SECONDS");
		} catch (Exception e) {
			System.out.println("FAIL::THE PAGE HAS  NOT LOADED WITHIN 10 SECONDS");
		}
		driver.quit();
		
	}
}
