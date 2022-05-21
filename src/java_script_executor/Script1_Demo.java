package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1_Demo {
//PROGRAM TO UNDRSTAND HOW TO USE JAVASCRIPT EXECUTOR USING JSCODE
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("alert('Happy New Year')");
		}
}
