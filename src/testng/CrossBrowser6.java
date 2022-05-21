package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser6 {

	WebDriver driver;
	@Parameters({"browserName", "username", "password"})
	@Test
	public void testReports(@Optional("chrome") String browserName,
							@Optional("trainee") String username, 
							@Optional("trainee")String password) {

		if (browserName. equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();  
		}else {
			Assert.fail("Only 2 browsers supported");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Enter Time-Track']")));
		WebElement reportsLink = driver.findElement(By.linkText("Reports"));
		Assert.assertTrue(reportsLink.isDisplayed(), "Reports Link Not Displayed");
		Assert.assertEquals(reportsLink.getText(), "Reports", "Reports Link Text Is Not Correct");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);    

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Reports Dashboard']")));
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title Is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do",
				"Reports Page URL is Not Correct");

		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("logoutLink")));
		driver.quit();
	}
}
