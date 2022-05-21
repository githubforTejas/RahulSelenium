package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_And_Drop4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/en/login");
		
		driver.findElement(By.id("user")).sendKeys("rahulwadi019@gmail.com");
		driver.findElement(By.id("login")).click();
		
		WebElement loginButton = driver.findElement(By.id("login-submit"));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		driver.findElement(By.id("password")).sendKeys("Rahul@1998");
		loginButton.click();
		
		driver.findElement(By.xpath("//h3[text()='Starred boards']/../..//div[@title='Fruits']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='A']")));
		WebElement source = driver.findElement(By.xpath("//span[text()='A']"));
		WebElement dest = driver.findElement(By.xpath("//h2[text()='Mango']/../..//span[text()='Add a card']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
		//driver.quit();
	}
}
