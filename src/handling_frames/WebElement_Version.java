package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Version {
//PROGRAM TO CLICK ON AN ELEMENT WITHIN A FRAME USING WEBELEMENT VERSION
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zoho.com/crm/features.html");
		
		driver.findElement(By.id("zsiq_agtpic")).click();
		
		//driver.switchTo().frame("siqiframe").findElement(By.id("visname")).sendKeys("Rahul");
		//THIS VERSION IS SLOW SO WE GO TO NEXT VERSION
		
		driver.switchTo().frame(driver.findElement(By.id("siqiframe"))).findElement(By.id("visname")).sendKeys("Rahul");
		driver.quit();
	}
}
