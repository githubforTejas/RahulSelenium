package webdrivermethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariSwitchTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
				
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String wid1 : allWindowIds) {
				driver.switchTo().window(wid1);
				if (driver.getTitle().equals("Register on Naukri.com: Apply to Millions of Jobs Online")) {
					break;
				}
		}
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("usernameField")).sendKeys("rahul0001@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("rahul1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.quit();
	}
}
