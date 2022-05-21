package pomtestscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.Demo_Homepage;
import pom.Demo_Loginpage;

public class TC001_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		Demo_Loginpage lp = new Demo_Loginpage();
		PageFactory.initElements(driver, lp);
		lp.getUserNameTextField().sendKeys("admin");
		driver.navigate().refresh();
		lp.getUserNameTextField().sendKeys("admin");
		lp.getPwdTextField().sendKeys("manager");
		lp.getLoginButton().click();
		
		Demo_Homepage hp = new Demo_Homepage();
		PageFactory.initElements(driver, hp);
		hp.getUsersLink().click();
		hp.getLogoutLink().click();
		driver.quit();
	}
}
