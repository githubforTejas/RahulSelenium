package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled2 {
//To Verify continue button is enabled after entering mail
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup");
		Thread.sleep(5000);
		WebElement continueButton = driver.findElement(By.cssSelector("button[data-continue-to='password-container']"));
		
		if (!continueButton.isEnabled()) {
			System.out.println("Pass::The continue button is disabled");
		}else {
			System.out.println("Fail::The continue button is enabled");
		}
		
		driver.findElement(By.id("email")).sendKeys("rakeshqwqs123@gmail.com");
		Thread.sleep(5000);
		if (continueButton.isEnabled()) {
			System.out.println("Pass::The continue button is enabled");
		}else {
			System.out.println("Fail::The continue button is disabled");
		}
		driver.quit();
	}
}
