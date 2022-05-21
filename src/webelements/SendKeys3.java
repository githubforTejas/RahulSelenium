 package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.name("firstname")).sendKeys("Rahul", new StringBuilder("Rakesh"), new StringBuffer("Laxmi"));
		Thread.sleep(5000);
		driver.quit();
	}
}
