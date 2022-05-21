package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextClick_RightClick {
//WAS TO VERIFY THE OPTIONS IN CONTEXT MENU(RIGHT CLICK)
	public static void main(String[] args) {
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
		
		WebElement thingsToDoCart = driver.findElement(By.xpath("//span[text()='Automate 100 Test Cases']"));
		Actions actions = new Actions(driver);
		actions.contextClick(thingsToDoCart).perform();
		
		if (driver.findElement(By.xpath("//span[text()='Edit labels']")).isDisplayed()) {
			System.out.println("Pass:: Edit Labels Context Menu is Displayed");
		} else {
			System.out.println("Pass:: Edit Labels Context Menu is not Displayed");
		}
		driver.quit();
	}
}
