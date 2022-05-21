package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
//PROGRAM TO CLICK ON AN ELEMENT WITH IN DROP DOWN MENU
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		//FIND THE TARGET WEBELEMENT
		WebElement kidsMenu = driver.findElement(By.cssSelector("a[data-group='kids']"));
		//CREATE THE ACTIONS OBJECT & SUPPLY REFERNCE
		Actions actions = new Actions(driver);
		//CALL SUITABLE NON-STATIC METHOD & CALL perform() METHOD
		actions.moveToElement(kidsMenu).perform();
		driver.findElement(By.linkText("Sunglasses")).click();
		driver.quit();
	}
}
