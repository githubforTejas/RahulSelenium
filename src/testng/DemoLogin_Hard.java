package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoLogin_Hard {
//PROGRAM USING HARD ASSERT & USING TIME CRITICAL TEST CASE
//IF THE TEST EXECUTION CROSESS THE timeout THEN WE WILL GET TIMECRITICAL EXCEPTION
	@Test(timeOut = 7000)
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Home Page Not Displayed");
		
		//List<WebElement> allTags = driver.findElements(By.tagName("Rahul"));
		//Assert.assertTrue(allTags.isEmpty(), "It Is Not Empty");
		//Assert.assertFalse(allTags.isEmpty(), "It Is Empty");
		
		Assert.fail("Sorry");
	}
}
