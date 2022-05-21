package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Logout_Script1 {

	public static void main(String[] args) {
		//STEP-1 LAUNCH CHROME BROWSER
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//STEP-2 ENTER THE URL
		driver.get("https://demo.actitime.com/login.do");
		//STEP-3 TO VERIFY LOGIN PAGE DISPLAYED
		String exceptedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		System.out.println("exceptedTitle: " + exceptedTitle);
		System.out.println("actualTitle: " + actualTitle);
		if (actualTitle.equals(exceptedTitle)) {
			System.out.println("Pass::The Login Page Is Displayed");
		}else {
			System.out.println("Fail::The Login Page Is Not Displayed");
		}
		//STEP-4 ENTER USERNAME & PASSWORD & CLICK ON LOGIN BUTTON
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//STEP-5 TO VERIFY HOME PAGE IS DISPLAYED
		String exceptedURL = "https://demo.actitime.com/user/submit_tt.do";
		try {
			wait.until(ExpectedConditions.urlMatches(exceptedURL));
			String actualURL = driver.getCurrentUrl();
			System.out.println("PASS::THE ACTUAL HOME PAGE DISPLAYED UPON VERIFICATION OF URL");
			System.out.println("exceptedURL: " + exceptedURL);
			System.out.println("actualURL" + actualURL);
		} catch (TimeoutException e) {
			System.out.println("FAIL::THE ACTUAL HOME PAGE NOT DISPLAYED");
		}
		String expectedHomeTitle = "actiTIME - Enter Time-Track";
		try {
			wait.until(ExpectedConditions.titleIs(expectedHomeTitle));
			
			String actualHomeTitle = driver.getTitle();
			System.out.println("PASS::THE ACTUAL HOME PAGE DISPLAYED UPON VERIFICATION OF TITLE");
			System.out.println("expectedHomeTitle: " + expectedHomeTitle);
			System.out.println("actualHomeTitle: " + actualHomeTitle);
		} catch (TimeoutException  e) {
			System.out.println("FAIL::THE ACTUAL HOME PAGE NOT DISPLAYED");
		}
		//STEP-6 TO LOGOUT FROM APPLICATION
		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();
		driver.quit();
	}
}
