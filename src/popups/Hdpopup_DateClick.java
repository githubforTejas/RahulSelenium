package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdpopup_DateClick {
//PROGRAM SELECT THE SPECIFIC DATE OF HIDDEN POPUP
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//div[text()='Apr 2022']/../..//li[text()='17']")).click();
	}
}
