package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kn-in.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("English (UK)")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}
}
