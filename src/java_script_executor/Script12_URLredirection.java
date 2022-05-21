package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12_URLredirection {
//PROGRAM TO MODIFY URL WITHOUT USING get() & navigate() METHOD
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		String URL = "https://demo.actitime.com/login.do";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("location.href=arguments[0]", URL);
		
		String expectedUrl = "https://demo.actitime.com/login.do";
		String actualUrl = (String) jse.executeScript("return document.URL");
		System.out.println("expectedUrl: "+expectedUrl);
		System.out.println("actualUrl: "+actualUrl);
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Pass:: The URL is correct");
		} else {
			System.out.println("Fail:: The URL is Incorrect");
		}
		
		String expectedTitle = "actiTIME - Login";
		String actualTitle = (String) jse.executeScript("return document.title");
		System.out.println("expectedTitle: "+expectedTitle);
		System.out.println("actualTitle: "+actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass:: The Title is correct");
		} else {
			System.out.println("Fail:: The Title is Incorrect");
		}
		driver.quit();
	}
}
