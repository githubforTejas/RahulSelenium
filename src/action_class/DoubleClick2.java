package action_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick2 {
//WAS TO DOUBLE CLICK ON A SPECIFIC CO-ORDINATE IN THE WEBPAGE, CREATE A CARD & VERIFY IT IS CREATED OR NOT
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		driver.findElement(By.id("login")).click();
		
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		loginButton.click();
		
		driver.findElement(By.xpath("//h3[text()='Starred boards']/../..//div[text()='My Java Sessions']")).click();
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveByOffset(640, 410).doubleClick().perform();
		
		driver.findElement(By.id("list-name")).sendKeys("Stand up meeting");
		driver.findElement(By.cssSelector("input[value='Add']")).click();
		
		List<WebElement> allBoardsList = driver.findElements(By.cssSelector("div[class='js-list list-wrapper']"));
		for (WebElement ele : allBoardsList) {
			if (ele.getText().contains("Stand up meeting")) {
				System.out.println("Pass:: The card is created");
				break;
			}
		}
		System.out.println("Fail:: The card is not created");
		driver.quit();
	}
}
