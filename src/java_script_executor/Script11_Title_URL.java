package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11_Title_URL {
//WRITE A SCRIPT TO VERIFY THE TITLE & URL OF THE PAGE WITHUOUT USING getTitle() & getCurrentUrl() METHOD
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:www.google.com");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String expectedTitle = "Google";
		String actualTitle = (String) jse.executeScript("return document.title");
		System.out.println("expectedTitle: " + expectedTitle);
		System.out.println("actualTitle: " + actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass::The title is correct");
		}else {
			System.out.println("Fail::The title is Incorrect");
		}
	
		String expectedURL = "https://www.google.com/";
		String actualURL = (String) jse.executeScript("return document.URL");
		System.out.println("expectedURL: " + expectedURL);
		System.out.println("actualURL: " + actualURL);
		if (actualURL.equals(expectedURL)) {
			System.out.println("Pass::The URL is correct");
		}else {
			System.out.println("Fail::The URL is Incorrect");
		}
		driver.quit();
	}
}
