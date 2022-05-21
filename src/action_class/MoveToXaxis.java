package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToXaxis {
//PROGRAM TO CLICK ON THE PARTICULAR CO-ORDINATES OF THE TARGET WEBELEMENT
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		WebElement jobsLink = driver.findElement(By.xpath("//div[text()='Companies']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(jobsLink, 150, 0).perform();// +ve x-axis
		actions.moveToElement(jobsLink, -100, 0).perform();// -ve x-axis
	}
}
