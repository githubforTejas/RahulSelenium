package pomtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Fb_SignUp;

public class TC005Fb_SignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		Fb_SignUp sp = new Fb_SignUp(driver);
		sp.getFirstNameTextField().sendKeys("Rahul");
		driver.quit();
	}
}
