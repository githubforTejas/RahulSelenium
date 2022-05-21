package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class CrossBrowserMethodBaseTest {

	WebDriver driver;
	WebDriverWait wait;
	@Parameters({"appUrl", "browserName", "username", "password"})
	@BeforeMethod
	public void login(@Optional("https://demo.actitime.com/login.do") String appUrl,
			@Optional("chrome") String browserName,
			@Optional("admin") String username, 
			@Optional("manager")String password) throws InterruptedException {

		if (browserName.equalsIgnoreCase("chrome")) {
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
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get(appUrl);

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
	}

	@AfterMethod
	public void logout() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("logoutLink")));
		driver.quit();
	}
}


