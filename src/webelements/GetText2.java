package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {
//A DEMO PROGRAM TO SHOW THAT getText() WILL RETURN TAG & SUBTAG TEXT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualText = driver.findElement(By.id("demoTooltipContainer")).getText();
		System.out.println("actualText: " + actualText);
		
		driver.quit();
	}
}
