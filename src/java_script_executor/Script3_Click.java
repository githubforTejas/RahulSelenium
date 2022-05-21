package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3_Click {
//PROGRAM TO CLICK ON LOGIN BUTTON USING JAVASCRIPT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//STEP-1 IDENTIFY THE TARGET WEBELEMENT USING findElement()
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		//STEP-2 DOWNCAST WEBDRIVER TO JAVASCRIPT
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//STEP-3 CALL executeScript() AND SUPPLY TARGET ELEMENT AS SECOND ARGUMENT
		//STEP-4 USE THE TARGET WEBELEMENTWIT IN THE SCRIPT USING ARGUMENTS ARRAY VARIABLE & CALL click()
		jse.executeScript("arguments[0].click();", loginButton);
		driver.quit();
	}
}
