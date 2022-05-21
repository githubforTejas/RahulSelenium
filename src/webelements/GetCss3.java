 package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCss3 {
//TO CHECK THE BOLDNESS OF ADMINISTRATOR TEXT IS CORRECT OR NOT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedBoldness = "700";
		String actualBoldness = driver.findElement(By.id("adminCredentialsHeader")).getCssValue("font-weight");
		
		System.out.println("expectedBoldness: " + expectedBoldness);
		System.out.println("actualBoldness: " + actualBoldness);
		
		if (actualBoldness.equals(expectedBoldness)) {
			System.out.println("Pass::The Text Is Bold");
		}else {
			System.out.println("Fail::The Text Is Not Bold");
		}
		driver.quit();
	}
}
