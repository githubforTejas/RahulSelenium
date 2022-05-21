package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown2 {
//PROGRAM TO SCROLL DOWN THE CUSTOM SCROLL BAR
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),\"May' 22\")]")).click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		actions.sendKeys(Keys.HOME).perform();
		
		driver.quit();
	}
}
