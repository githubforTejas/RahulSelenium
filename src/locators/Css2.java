package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("transparent")).click();
		Thread.sleep(5000);
		String ExpectedTitle = "Login to Malaicha - Malaicha.com | Send Goods and Groceries";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.contains(ExpectedTitle)) {
			System.out.println("PASS:: THE LOGIN PAGE DISPLAYED");
		}else {
			System.out.println("FAIL::THE LOGIN PAGE NOT DISPLAYED");
		}
		driver.findElement(By.name("username")).sendKeys("rahulwadi019@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("pin")).sendKeys("Rahul@123");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
 