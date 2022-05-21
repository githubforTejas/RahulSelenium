package action_class;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown {
//PROGRAM TO PERFORM CONTROL+CLICK OPERATION TO OPEN THE LINK IN NEW TAB
// EXECUTING MULTIPLE ACTIONS TOGETHR USING ACTION CLASS is called COMPOSITE ACTIONS 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.qspiders.com/");
		
		WebElement aboutUs = driver.findElement(By.xpath("//span[text()='About Us']"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(aboutUs).keyUp(Keys.CONTROL).perform();
		driver.quit();
	}
}
