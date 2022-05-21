package java_script_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14_Highlight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");
		
		LibraryClass.heighlightAndClick(driver, driver.findElement(By.className("Login")));
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("rahulwadi019@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Rahul@1998");
		LibraryClass.heighlightAndClick(driver, driver.findElement(By.xpath("//button[text()='Login']")));
		LibraryClass.heighlightAndClick(driver, driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")));
		
		driver.quit();
	}
}
