package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitButton = driver.findElement(By.name("submit"));
		
		if (!submitButton.isEnabled()) {
			System.out.println("Pass::The Button Is Disabled");
		}else {
			System.out.println("Fail::The Button Is Enabled");
		}
		driver.quit();
	}
}
