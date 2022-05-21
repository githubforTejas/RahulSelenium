package handling_forms_tables_div;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement regForm = driver.findElement(By.id("reg"));
		regForm.findElement(By.name("firstname")).sendKeys("Rahul");
		regForm.findElement(By.name("lastname")).sendKeys("Wadi");
		regForm.findElement(By.name("reg_email__")).sendKeys("9789898989");
		driver.quit();
	}
}
