package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		if (driver.findElement(By.id("email")).isDisplayed()) {
			System.out.println("PASS :: THE EMAIL TEXTFIELD IS DISPLAYED");
		}else {
			System.out.println("FAIL :: THE EMAIL TEXTFIELD IS NOT DISPLAYED");
		}
		
		if (driver.findElement(By.id("pass")).isDisplayed()) {
			System.out.println("PASS :: THE PASSWORD TEXTFIELD IS DISPLAYED");
		}else {
			System.out.println("FAIL :: THE PASSWORD TEXTFIELD IS NOT DISPLAYED");
		}

		if (driver.findElement(By.name("login")).isDisplayed()) {
			System.out.println("PASS :: THE LOGIN BUTTON IS DISPLAYED");
		}else {
			System.out.println("FAIL :: THE LOGIN BUTTON IS NOT DISPLAYED");
		} 
		driver.quit();
	}
}
