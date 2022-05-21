package action_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown1 {
//PROGRAM TO CLICK ON LINKS ONE AFTER OTHER
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.qspiders.com/");
		
		List<WebElement> menuListLink = driver.findElements(By.xpath("//div[@class='navbar-end']//a[@class='navbar-item' or contains(@href,'placements')]"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		for (WebElement ele : menuListLink) {
			actions.click(ele);
		}
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		driver.quit();
	}
}
