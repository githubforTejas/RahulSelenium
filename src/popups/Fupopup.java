package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fupopup {
//PROGRAM TO UPLOAD A FILE BY AVOIDING FILE UPLOAD POPUP
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("nameishemanth105@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Testing@123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.cssSelector("div[aria-label='Account']")).click();
		driver.findElement(By.xpath("//span[text()='Give feedback']")).click();
		driver.findElement(By.xpath("//span[text()='Help us improve the new Facebook']")).click();
		
		String upload = "//div[@aria-label='Add a Screenshot or Video (recommended)']/preceding-sibling::input";
		driver.findElement(By.xpath(upload)).sendKeys("F:\\PHOTOS\\Golgumbaz\\20190106_135945.jpg");
		driver.quit();
	}
}
