package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {
//WRITE A SCRIPT TO VERIFY TEXT OF THE WEBELEMENT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expextedText = "Administrator:";
		String actualText = driver.findElement(By.id("adminCredentialsHeader")).getText();
		
		System.out.println("expextedText: " + expextedText);
		System.out.println("actualText: " + actualText);
		
		if (actualText.equals(expextedText)) {
			System.out.println("PASS :: THE TEXT IS CORRECT");
		}else {
			System.out.println("FAIL :: THE TEXT IS INCORRECT");
		}
		driver.quit();
	}
}
