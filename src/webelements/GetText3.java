 package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedText = "Please identify yourself";
		String actualText = driver.findElement(By.id("headerContainer")).getText();
		
		System.out.println("expectedText: " + expectedText);
		System.out.println("actualText: " + actualText);
		
		if (actualText.equals(expectedText)) {
			System.out.println("Pass:: The Text is Correct");
		}else {
			System.out.println("Fail:: The text is incorrect");
		}
		driver.quit();
	}
}
