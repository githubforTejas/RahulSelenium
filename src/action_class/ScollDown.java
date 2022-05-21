package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScollDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		Actions actions = new Actions(driver);
		for(;;) {
			try {
				WebElement link = driver.findElement(By.linkText("Women's Cricket World Cup 2022 begins!"));
				actions.click(link).perform();
				break;
			} catch (NoSuchElementException e) {
				actions.sendKeys(Keys.PAGE_DOWN).perform();
			}
		}	
	}
}
