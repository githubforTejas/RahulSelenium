package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String expectedText = "?";
		String actualText = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover/initiate/?')]")).getText();
		
		System.out.println("expectedText: " + expectedText);
		System.out.println("actualText: " + actualText);
		
		if (actualText.contains(expectedText)) {
			System.out.println("Pass:: The Text is correct");
		}else {
			System.out.println("Fail:: The text is incorrect");
		}
		driver.quit();
	}
}
