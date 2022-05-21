package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvdr {
//PROGRAM TO RUN SAME TEST CASE MULTIPLE TIMES WITH MULTIPLE DATA       
	@DataProvider
	public String[] getData() {
		String[] usernames = {"admin", "admin123", "admin5463353abcd"};
		return usernames;
	}
	
	@Test(dataProvider = "getData")
	public void loginTest(String userData) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys(userData);
	}
}
