package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expectedText = "Facebook helps you connect and share with the people in your life.";
		String actualText = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println("expectedText: " + expectedText);
		System.out.println("actualText: " + actualText);
		
		if (actualText.equals(expectedText)) {
			System.out.println("Pass:: The Text is correct");
		}else {
			System.out.println("Fail:: The text is incorrect");
		}
		driver.quit();
	}
}
