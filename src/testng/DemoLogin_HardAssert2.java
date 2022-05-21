package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoLogin_HardAssert2 {
//PROGRAM TO SHOW HOW TO RUN PARALLEL EXECUTION, MULTIPLE TIME EXECUTION AND HOW TO USE DESCRIPTION
	@Test(description = "Login With Valid Credentials & Verify Logout Link is Displayed", invocationCount = 2, threadPoolSize = 2)
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.findElement(By.id("logoutLink")).isDisplayed(), "Logout Link Not Displayed");
		driver.quit();
	}
}
