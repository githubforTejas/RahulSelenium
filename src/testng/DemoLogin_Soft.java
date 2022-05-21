package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoLogin_Soft {
//PROGRAM USING SOFTASSERT & EXECUTING PARALLELY
	@Test(invocationCount = 2)
	public void testLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(driver.findElement(By.id("username")).isEnabled(), "Username is Enabled");
		sa.assertFalse(driver.findElement(By.name("pwd")).isEnabled(), "Password Field is Not Disabled");
		sa.assertTrue(driver.findElement(By.id("keepLoggedInCheckBox")).isSelected(), "Remember CheckBox is Not Selected");
		sa.assertTrue(driver.findElement(By.id("loginButton")).isEnabled());
		driver.findElement(By.id("loginButton")).click();
		
		sa.assertAll();
	}
}
