package pomtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Orange_Login;
import pom.Orange_Logout;

public class TC002_Orange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		new Orange_Login(driver).login("admin", "admin123");
		
		Orange_Logout out = new Orange_Logout(driver);
		out.getBuzzLink().click();
		out.logout();
		
		driver.quit();
	}
}
